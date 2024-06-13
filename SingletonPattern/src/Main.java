import com.singleton.Logger;

/**
 * As we have a singleton pattern and only one instance of logger, all logging is written in same file
 */
public class Main {
    public static void main(String[] args) {

        Logger l1 = Logger.getInstance();
        l1.writeMessage("Main method called");

        method1();
        int res = method2(5, 9);

        l1.writeMessage("Main method completed with result " + res);
    }

    public static void method1() {
        Logger l1 = Logger.getInstance();
        l1.writeMessage("Method1 method called");
    }

    public static int method2(int x, int y) {
        Logger l1 = Logger.getInstance();
        l1.writeMessage("Method2 method called");

        int result = x * y;
        l1.writeMessage("Method2 method completed with result " + result);

        return result;
    }
}