package main

import (
	"SQLParser/service"
	"github.com/spf13/cobra"
)

func main(){

	var input string
	var outputFilePath string
	var flag string

	var sqlParserCmd = &cobra.Command{
		Use:   " [string]",
		Short: "parser sql",
		Long: `This tool can extract tableName,columns,alias from sql, only support clickhouse currently`,
		Run: func(cmd *cobra.Command, args []string) {
			service.Excute(input,outputFilePath,flag)
		},
	}

	sqlParserCmd.Flags().StringVarP(&flag,"get","g","","t:tableName  c:columns  a:alias")
	sqlParserCmd.Flags().StringVarP(&outputFilePath,"output","o","","output file path,default output-temp.txt")
	sqlParserCmd.Flags().StringVarP(&input,"input","i","","input file path")


	sqlParserCmd.Execute()



	//parser.Excute("input/clickhouse-select.sql","","")
}