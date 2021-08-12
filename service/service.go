package service

import "github.com/928095762/SQLParser/clickhouse_parser"

func Excute(input,outputFilePath,flag string){
	driver := clickhouse_parser.ClickhouseDrive{}
	driver.GetInputSql(input)
	driver.ExcuteParser()
	driver.Output(flag,outputFilePath)
}