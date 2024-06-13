package factoryproject;

public class MathOperationFactory {

    private MathOperationFactory() {}

    public static MathOperation getMethodOperator(String opr) {
        return switch (opr) {
            case "add" -> new Adder();
            case "sub" -> new Subtracter();
            case "multiply" -> new Multiplier();
            default -> throw new IllegalArgumentException("Unknown operator: " + opr);
        };
    }

    private static class Adder implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a+b;
        }
    }

    private static class Subtracter implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a-b;
        }
    }

    private static class Multiplier implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a*b;
        }
    }
}
