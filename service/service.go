package service

import "SQLParser/clickhouse_parser"

func Excute(input,outputFilePath,flag string){
	driver := clickhouse_parser.ClickhouseDrive{}
	driver.GetInputSql(input)
	driver.ExcuteParser()
	driver.Output(flag,outputFilePath)
}