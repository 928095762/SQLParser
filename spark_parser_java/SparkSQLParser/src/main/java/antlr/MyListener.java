package antlr;

import cn.freewheel.SqlBaseBaseListener;
import cn.freewheel.SqlBaseParser;

import java.util.ArrayList;
import java.util.List;

public class MyListener extends SqlBaseBaseListener{

    public List<String> alias = new ArrayList<>();

    @Override public void enterNamedExpression(SqlBaseParser.NamedExpressionContext ctx) {
        alias.add(ctx.getChild(2).getText());
    }
}
