package external

import (
	"github.com/928095762/SQLParser/clickhouse_parser"
	"github.com/928095762/SQLParser/parser"
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