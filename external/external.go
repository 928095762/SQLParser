package external

import (
	"SQLParser/clickhouse_parser"
	"SQLParser/parser"
	"strings"
)

func GetJsonParser(DBType,sql string) string {
	var driver parser.ParserDriver
	if strings.EqualFold(DBType,"clickhouse"){
		driver = &clickhouse_parser.ClickhouseDrive{InputSql: sql}
	}

	driver.ExcuteParser()

	return driver.ToJSON()
}

func GetParser(DBType,sql string) parser.Table{
	var driver parser.ParserDriver
	if strings.EqualFold(DBType,"clickhouse"){
		driver = &clickhouse_parser.ClickhouseDrive{InputSql: sql}
	}

	driver.ExcuteParser()
	return driver.GetParser()
}