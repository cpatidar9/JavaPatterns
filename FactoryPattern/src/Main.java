import factoryproject.MathOperation;
import factoryproject.MathOperationFactory;

public class Main {
    public static void main(String[] args) {

        MathOperation mathOperation1 = MathOperationFactory.getMethodOperator("add");
        int result1 = mathOperation1.operate(2, 6);
        System.out.println(result1);

        MathOperation mathOperation2 = MathOperationFactory.getMethodOperator("sub");
        int result2 = mathOperation2.operate(2, 6);
        System.out.println(result2);

        MathOperation mathOperation3 = MathOperationFactory.getMethodOperator("multiply");
        int result3 = mathOperation3.operate(2, 6);
        System.out.println(result3);

        MathOperation mathOperation4 = MathOperationFactory.getMethodOperator("divide");
        int result4 = mathOperation4.operate(2, 6);
        System.out.println(result4);
    }
}