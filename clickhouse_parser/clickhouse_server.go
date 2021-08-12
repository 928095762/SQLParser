package clickhouse_parser

import (
	"github.com/928095762/SQLParser/parser"
	"github.com/928095762/SQLParser/utils"
	"encoding/json"
	"fmt"
	"github.com/antlr/antlr4/runtime/Go/antlr"
	"io/ioutil"
	"os"
	"strings"
)

type ClickhouseDrive struct {
	*BaseClickHouseParserListener
	InputSql string
	Table parser.Table
}
func (clickhouseDrive *ClickhouseDrive) GetParser() parser.Table{
	return clickhouseDrive.Table;
}

func (clickhouseDrive *ClickhouseDrive) ToJSON()string {
	json, err := json.Marshal(clickhouseDrive.Table)
	utils.CheckErr(err)
	return string(json)
}



func (clickhouseDrive *ClickhouseDrive) GetInputSql(filePath string) {
	if filePath == "" || len(filePath) == 0{
		fmt.Println("please input a file........")
		utils.CheckErr(nil)
	}
	file, err := os.Open(filePath)
	utils.CheckErr(err)

	defer file.Close()

	byteValues, err := ioutil.ReadAll(file)
	clickhouseDrive.InputSql = string(byteValues)
}

func (clickhouseDrive *ClickhouseDrive) Output(flag string,outputFilePath string){
	if "" == outputFilePath {
		outputFilePath = "output-temp.txt"
	}
	if !strings.Contains(outputFilePath,"."){
		outputFilePath = outputFilePath + ".txt"
	}

	lf, err := os.OpenFile(outputFilePath,
		os.O_CREATE|os.O_WRONLY|os.O_APPEND, 0660)
	defer lf.Close()
	utils.CheckErr(err)

	if "" == flag {
		lf.WriteString("TableName: ")
		lf.WriteString(clickhouseDrive.Table.TableName)
		lf.WriteString("\r\n")

		lf.WriteString("--- Columns ---")
		lf.WriteString("\r\n")

		for i,count := 0,len(clickhouseDrive.Table.Columns);i<count;i++{
			lf.WriteString(clickhouseDrive.Table.Columns[i].Name)
			lf.WriteString(": ")
			lf.WriteString(clickhouseDrive.Table.Columns[i].Custom)
			lf.WriteString("\r\n")
		}
		return
	}


	if strings.EqualFold(flag,"t"){
		lf.WriteString("TableName: ")
		lf.WriteString(clickhouseDrive.Table.TableName)
	}else if strings.EqualFold(flag,"c"){
		lf.WriteString("--- Columns ---")
		lf.WriteString("\r\n")

		for i,count := 0,len(clickhouseDrive.Table.Columns);i<count;i++{
			lf.WriteString(clickhouseDrive.Table.Columns[i].Name)
			lf.WriteString(": ")
			lf.WriteString(clickhouseDrive.Table.Columns[i].Custom)
			lf.WriteString("\r\n")
		}
	}else if strings.EqualFold(flag,"a"){
		lf.WriteString("--- Alias ---")
		lf.WriteString("\r\n")

		for i,count := 0,len(clickhouseDrive.Table.Columns);i<count;i++{
			lf.WriteString(clickhouseDrive.Table.Columns[i].Name)
			lf.WriteString("\r\n")
		}
	}

}

func (clickhouseDrive *ClickhouseDrive) ExcuteParser() {
	// Setup the input
	input := antlr.NewInputStream(clickhouseDrive.InputSql)

	// Create the Lexer
	lexer := NewClickHouseLexer(input)
	stream := antlr.NewCommonTokenStream(lexer,0)

	// Create the Parser
	p := NewClickHouseParser(stream)

	p.BuildParseTrees = true

	tree := p.QueryStmt()

	// Finally parse the expression
	listener := NewClickhouseListener()

	antlr.ParseTreeWalkerDefault.Walk(listener,tree)

	clickhouseDrive.Table = listener.table

	clickhouseDrive.Table.ColumnsCount = len(listener.table.Columns)



	//fmt.Println(clickhouseDrive.table.TableName)
	//
	//for k,v := range clickhouseDrive.table.Columns{
	//	fmt.Println(k,":",v)
	//}
	//fmt.Println(len(clickhouseDrive.table.Columns))
}


type ClickhouseListener struct {
	*BaseClickHouseParserListener
	table parser.Table
}

func NewClickhouseListener() *ClickhouseListener {
	obj := new(ClickhouseListener)
	return obj
}

func (this *ClickhouseListener) EnterTableIdentifier(ctx *TableIdentifierContext) {
	this.table.TableName = ctx.GetText()
}

// select as
func (this *ClickhouseListener) EnterColumnExprAlias(ctx *ColumnExprAliasContext) {
	this.table.Columns = append(this.table.Columns, parser.Column{ctx.GetChild(ctx.GetChildCount() - 1).(antlr.ParseTree).GetText(), ctx.GetChild(0).(antlr.ParseTree).GetText()})
}

// create table
func (this *ClickhouseListener) EnterTableElementExprColumn(ctx *TableElementExprColumnContext) {
	count := ctx.GetChildCount()
	//this.table.ColumnsCount = count
	for i := 0;i<count;i++{
		columnName := strings.ReplaceAll(ctx.GetChild(i).GetChild(0).(antlr.ParseTree).GetText(), "`", "")
		this.table.Columns = append(this.table.Columns,parser.Column{columnName,ctx.GetChild(i).GetChild(1).(antlr.ParseTree).GetText()})
	}
}

// insert
func (this *ClickhouseListener) EnterColumnsClause(ctx *ColumnsClauseContext) {
	for i,count := 1,ctx.GetChildCount();i < count;i+=2{
		this.table.Columns = append(this.table.Columns,parser.Column{ctx.GetChild(i).(antlr.ParseTree).GetText(),""})
	}
}