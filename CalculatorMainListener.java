import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayDeque;
import java.util.Deque;

public class CalculatorMainListener  extends CalculatorBaseListener{
    Deque<Integer> numbers = new ArrayDeque<>();
    Deque<Integer> numbers2 = new ArrayDeque<>();



    @Override
    public void enterMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        super.enterMultiplyingExpression(ctx);
    }

    @Override
    public void enterPoweringExpression(CalculatorParser.PoweringExpressionContext ctx) {
        super.enterPoweringExpression(ctx);
    }

    @Override
    public void enterSqrtExpression(CalculatorParser.SqrtExpressionContext ctx) {
        super.enterSqrtExpression(ctx);
    }


    @Override
    public void enterIntegralExpression(CalculatorParser.IntegralExpressionContext ctx) {
        super.enterIntegralExpression(ctx);
    }
    @Override
    public void exitSqrtExpression(CalculatorParser.SqrtExpressionContext ctx) {
        if(ctx.getChildCount()>2)
            throw new ArithmeticException("Nie może być liczba ujemna pod pierwiastkiem");
        numbers.add((int) Math.sqrt(Integer.valueOf(ctx.INT().toString())));
        super.exitSqrtExpression(ctx);
        System.out.println("exitSqrtExpression:"+ctx.getText()+" ; numbers:"+numbers);
//        throw new ArithmeticException("Nie może być liczba ujemna pod pierwiastkiem");
    }

    @Override
    public void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        System.out.println("exitMultiplyingExpression:"+ctx.getText()+" ; numbers:"+numbers);
        Integer value1 = null;
        Integer value2 = null;
        for(int i=1; i< ctx.getChildCount(); i=i+2){
            String operator = ctx.getChild(i).getText();
            if(operator.equals("*"))
            {
                System.out.println("Przed popem : numbers:"+numbers);
                value1=numbers.pop();
                value2=numbers.pop();
                System.out.println("Tuż po popu : numbers:"+numbers+" , "+value1+" "+value2);
                value1*=value2;
                System.out.println("Po popie : numbers:"+numbers+" , "+value1);
                numbers.addFirst(value1);
            }
            else if(operator.equals("/"))
            {
                System.out.println("Przed popem : numbers:"+numbers);
                value1=numbers.pop();
                value2=numbers.pop();
                if(value2==0)
                    throw new ArithmeticException("Nie można dzielić przez 0");
                System.out.println("Tuż po popu : numbers:"+numbers+" , "+value1+" "+value2);
                value1=value1/value2;
                System.out.println("Po popie : numbers:"+numbers);
                numbers.addFirst(value1);
            }
        }
        value1=numbers.pop();
        numbers2.add(value1);
        super.exitMultiplyingExpression(ctx);
    }
    @Override
    public void exitPoweringExpression(CalculatorParser.PoweringExpressionContext ctx) {
        System.out.println("exitPoweringExpression:"+ctx.getText()+" ; numbers:"+numbers);
        if (ctx.getChild(1) != null)
        {
            Integer number = numbers.pollLast();
            Integer value0 = numbers.pollLast();
            Integer value = value0;
            for(int i=1; i<number ; i++)
                value = value* value0;
            numbers.add(value);
        }
        super.exitPoweringExpression(ctx);
    }

    @Override
    public void exitIntegralExpression(CalculatorParser.IntegralExpressionContext ctx) {

        if (ctx.MINUS() != null)
        {
            numbers.add(-1 * Integer.valueOf(ctx.INT().toString()));
        }
        else
        {
            numbers.add(Integer.valueOf(ctx.INT().toString()));
        }
        super.exitIntegralExpression(ctx);
        System.out.println("exitIntegralExpression:"+ctx.getText()+" ; numbers:"+numbers);
    }
    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        System.out.println("exitExpression:"+ctx.getText()+" ; numbers2:"+numbers2);
        Integer value = numbers2.pop();
        for(int i=1; i< ctx.getChildCount(); i=i+2){
            String operator = ctx.getChild(i).getText();
            Integer number = numbers2.pop();
            if(operator.equals("+"))
            {
                value += number;
            }
            else if(operator.equals("-"))
            {
                value -= number;
            }
        }
        numbers2.add(value);
        super.exitExpression(ctx);
    }
    public static void main(String[] args) throws Exception {
        //CharStream charStreams = CharStreams.fromFileName("./example.txt");
        Integer result = calc("1+sqrt4*2/3^2-3");
        System.out.println("Result = " + result);
    }
    public static Integer calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static Integer calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        CalculatorMainListener mainListener = new CalculatorMainListener();
        walker.walk(mainListener, tree);
        return mainListener.getResult();
    }

    private Integer getResult() {
        return numbers2.peek();
    }

}
