import java.util.Scanner;

public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }

        int leftOperand = Integer.parseInt(args[0]);
        String operator = args[1];
        int rightOperand = Integer.parseInt(args[2]);


        int result = 0;

        switch (operator) {
            case "%":
                
                    result = leftOperand % rightOperand;
                
                break;
            case "+":
                result = leftOperand + rightOperand;
                break;
            case "-":
                result = leftOperand - rightOperand;
                break;
            case "*":
                result = leftOperand * rightOperand;
                break;
            case "/":
                result = leftOperand / rightOperand;
                break;
            default:
                    return "Error";
        }
        return result + "";
    }
}