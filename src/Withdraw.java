import java.util.*;

class Withdraw {
    public static void withdraw() {
        System.out.println("Enter amount to be withdraw: ");
        Scanner in = new Scanner(System.in);
        int withdraw = in.nextInt();
        if (ATMp.balance >= withdraw) {
            ATMp.balance = ATMp.balance - withdraw;
            System.out.println("Balance amount is: " + ATMp.balance);
            System.out.println("Please collect your money.");
        } else {
            System.out.println("You don't have enough money for withdrawal! ");
        }
        System.out.println(" ");
    }
}	