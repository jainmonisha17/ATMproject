import java.util.*;

class Deposit {

    public static void deposit() {
        System.out.println("Enter amount to deposit: ");
        Scanner in = new Scanner(System.in);
        int deposit = in.nextInt();
        ATMp.balance = ATMp.balance + deposit;
        System.out.println("Balance amount is " + ATMp.balance);
        System.out.println("Money has been deposited successfully!");
        System.out.println(" ");
    }
}	