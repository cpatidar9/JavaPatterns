import com.project.States;
import com.project.StatesCacheProxyUtil;

public class Main {
    public static void main(String[] args) {

        States states = new StatesCacheProxyUtil();

        System.out.println(states.getCapital("ap"));
        System.out.println(states.getCapital("bihar"));
        System.out.println(states.getCapital("ap"));
        System.out.println(states.getCapital("punjab"));
        System.out.println(states.getCapital("ap"));

    }
}