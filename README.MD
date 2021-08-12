**SQLParser**

# Overview
This is the code for help extract tableName,columns,alias from one sql.

# Requirements
## Hard Ones
- Golang https://golang.org/

## Soft Ones
- The sql file to parser.
    
# Getting Started
1. Install the hard requirements
2. Clone the code repo
3. Run below commands
    ```sh
    $ go run main.go -i yourSqlFile 
    ```
	or
	 ```sh
    $ make
	$ ./main -i yourSqlFile  
    ```
4. get the output-temp.txt

# Description of the args

| Short  | Long  | Description  |
|:----------|:----------|:----------|
| -g    | --get    | t: tableName  c: columns  a: alias    |
| -i    | --input    | input file path    |
| -o    | --output    | output file path,default output-temp.txt    |
| -h    | --help    | help for this command    |

## Example
- Run below command to get help for the input args
 	```
	$ go run main.go -h 
	```
	or
	```
	$ go run main.go --help
	```
- run below command to get sql parser result
	```
	$ go run main.go -g c -i intput.sql -o output.txt
	```
	equals
	```
	$ go run main.go --get c --input intput.sql --output output.txt
	```
---
**How to generate ClickhouseParser\*.go**

# Requirements
## Hard Ones
- Golang https://golang.org/
- JDK (Java Development Kit) https://www.java.com/en/

## Soft Ones
- ClickHouseLexer.g4 and ClickHouseParser.g4    see [here](https://github.com/ClickHouse/ClickHouse/tree/master/utils/antlr)


# Steps
1. Download the Clickhouse*.g4. 
2. update ClickHouseParser.g4 as below diff.
	```
	dictionarySchemaClause: LPAREN dictionaryAttrDfnt (COMMA dictionaryAttrDfnt)* RPAREN;
 	dictionaryAttrDfnt
	-locals [map[string]bool attrs]:
	+locals [std::set<std::string> attrs]:
     	identifier columnTypeExpr
	-( {!$attrs["default"]}?      DEFAULT literal       {$attrs["default"]=true;}
	-| {!$attrs["expression"]}?   EXPRESSION columnExpr {$attrs["expression"]=true;}
	-| {!$attrs["hierarchical"]}? HIERARCHICAL          {$attrs["hierarchical"]=true;}
	-| {!$attrs["injective"]}?    INJECTIVE             {$attrs["injective"]=true;}
	-| {!$attrs["is_object_id"]}? IS_OBJECT_ID          {$attrs["is_object_id"]=true;}
	+( {!$attrs.count("default")}?      DEFAULT literal       {$attrs.insert("default");}
	+| {!$attrs.count("expression")}?   EXPRESSION columnExpr {$attrs.insert("expression");}
	+| {!$attrs.count("hierarchical")}? HIERARCHICAL          {$attrs.insert("hierarchical");}
	+| {!$attrs.count("injective")}?    INJECTIVE             {$attrs.insert("injective");}
	+| {!$attrs.count("is_object_id")}? IS_OBJECT_ID          {$attrs.insert("is_object_id");}
     	)*
     	;
 	dictionaryEngineClause
	-locals [map[string]bool clauses]:
	+locals [std::set<std::string> clauses]:
	     dictionaryPrimaryKeyClause?
	-( {!$clauses["source"]}? sourceClause {$clauses["source"]=true;}
	-| {!$clauses["lifetime"]}? lifetimeClause {$clauses["lifetime"]=true;}
	-| {!$clauses["layout"]}? layoutClause {$clauses["layout"]=true;}
	-| {!$clauses["range"]}? rangeClause {$clauses["range"]=true;}
	-| {!$clauses["settings"]}? dictionarySettingsClause {$clauses["settings"]=true;}
	+( {!$clauses.count("source")}? sourceClause {$clauses.insert("source");}
	+| {!$clauses.count("lifetime")}? lifetimeClause {$clauses.insert("lifetime");}
	+| {!$clauses.count("layout")}? layoutClause {$clauses.insert("layout");}
	+| {!$clauses.count("range")}? rangeClause {$clauses.insert("range");}
	+| {!$clauses.count("settings")}? dictionarySettingsClause {$clauses.insert("settings");}
     	)*
     	;
 	dictionaryPrimaryKeyClause: PRIMARY KEY columnExprList;

 	engineClause
	-locals [map[string]bool clauses]:
	+locals [std::set<std::string> clauses]:
     	engineExpr
	-( {!$clauses["orderByClause"]}?     orderByClause     {$clauses["orderByClause"]=true;}
	-| {!$clauses["partitionByClause"]}? partitionByClause $clauses["partitionByClause"]=true;}
	-| {!$clauses["primaryKeyClause"]}?  primaryKeyClause  {$clauses["primaryKeyClause"]=true;}
	-| {!$clauses["sampleByClause"]}?    sampleByClause    {$clauses["sampleByClause"]=true;}
	-| {!$clauses["ttlClause"]}?         ttlClause         {$clauses["ttlClause"]=true;}
	-| {!$clauses["settingsClause"]}?    settingsClause    {$clauses["settingsClause"]=true;}
	+( {!$clauses.count("orderByClause")}?     orderByClause     	{$clauses.insert("orderByClause");}
	+| {!$clauses.count("partitionByClause")}? partitionByClause 	{$clauses.insert("partitionByClause");}
	+| {!$clauses.count("primaryKeyClause")}?  primaryKeyClause  	{$clauses.insert("primaryKeyClause");}
	+| {!$clauses.count("sampleByClause")}?    sampleByClause    	{$clauses.insert("sampleByClause");}
	+| {!$clauses.count("ttlClause")}?         ttlClause         	{$clauses.insert("ttlClause");}
	+| {!$clauses.count("settingsClause")}?    settingsClause    	{$clauses.insert("settingsClause");}
     	)*
     	;
 	partitionByClause: PARTITION BY columnExpr;
	```
3. Download
	```
	$ cd /usr/local/lib
	$ curl -O https://www.antlr.org/download/antlr-4.9-complete.jar
	```
	Or just download in browser from website: https://www.antlr.org/download.html and put it somewhere rational like /usr/local/
4. Add antlr-4.9-complete.jar to your CLASSPATH:
	```
	$ export CLASSPATH=".:/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH"
	```
	It's also a good idea to put this in your .bash_profile or whatever your startup script is.
5. Create aliases for the ANTLR Tool, and TestRig.
	```
	$ alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH" 	org.antlr.v4.Tool'
	$ alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH" 	org.antlr.v4.gui.TestRig'
	```
6. Run ANTLR
	```
	$ antlr4 -Dlanguage=Go ClickhouseLexer.g4
	$ antlr4 -Dlanguage=Go ClickhouseParser.g4
	```
	For a full list of antlr4 tool options, see [here](https://github.com/antlr/antlr4/blob/master/doc/tool-options.md) 
7. update clickhouse_parser.go as below diff
	```
	 import (
 	"fmt"
 	"reflect"
	@@ -7210,7 +7209,7 @@
 
 		p.parser = parser
 		p.RuleIndex = ClickHouseParserRULE_dictionaryAttrDfnt
		-
		+	p.attrs = make(map[string]bool)
 		return p
 	}
 
	@@ -7492,6 +7491,7 @@
 		var p = new(DictionaryEngineClauseContext)
 		p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
 		p.RuleIndex = ClickHouseParserRULE_dictionaryEngineClause

		+	p.clauses = make(map[string]bool)
 		return p
	 }
 
	@@ -7504,7 +7504,7 @@
 
 		p.parser = parser
 		p.RuleIndex = ClickHouseParserRULE_dictionaryEngineClause
		-
		+	p.clauses = make(map[string]bool)
 		return p
 	}
 
	@@ -9646,7 +9646,7 @@
 
 		p.parser = parser
 		p.RuleIndex = ClickHouseParserRULE_engineClause
		-
		+	p.clauses = make(map[string]bool)
 		return p
	 }

	```
