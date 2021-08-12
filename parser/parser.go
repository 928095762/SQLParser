package parser

type ParserDriver interface {
	GetInputSql(filePath string)
	ExcuteParser()
	Output(flag string,outputFilePath string)
	ToJSON()string
	GetParser() Table
}

type Table struct {
	TableName string
	Columns []Column
	ColumnsCount int
}

type Column struct {
	Name string
	Custom string
}

