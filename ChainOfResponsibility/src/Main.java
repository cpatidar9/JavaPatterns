import java.util.Scanner;

import com.cor.ATMMachine;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount:");

        int amount = scanner.nextInt();
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.dispense(amount);
    }
}