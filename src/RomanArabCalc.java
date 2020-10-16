import java.util.Locale;
import java.util.Scanner;

public class RomanArabCalc
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String expression;
        String toExit = "0";
        String oper = "";
        int operPos = 0;
        do
        {
            System.out.println("Input:\n");
            expression = in.nextLine();
            expression = expression.toLowerCase().trim();

            if (expression.indexOf("*") > 0)
            {
                operPos = expression.indexOf("*");
                oper = "*";
            }
            else if (expression.indexOf("/") > 0)
            {
                operPos = expression.indexOf("/");
                oper = "/";
            }
            else if (expression.indexOf("+") > 0)
            {
                operPos = expression.indexOf("+");
                oper = "+";
            }
            else if (expression.indexOf("-") > 0)
            {
                operPos = expression.indexOf("-");
                oper = "-";
            }

            notGoodCalc calc = new notGoodCalc(expression.substring(0, operPos),
                    expression.substring(operPos + 1, expression.length()), oper);

            calc.verifyInputValues();
            calc.calculate(false);

            System.out.println("Посчитать еще? (0 = Нет, Enter = Продолжить: ");
        }
        while (in.nextLine() != "0");
        System.exit(0);

    }
}



