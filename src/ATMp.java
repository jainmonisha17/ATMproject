import java.util.*;

class ATMp {
    static int balance = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1. Withdraw: ");
            System.out.println("2. Deposit: ");
            System.out.println("3. Check balance: ");
            System.out.println("4. Exit ");

            int num = in.nextInt();
            switch (num) {
                case 1:
                    Withdraw.withdraw();
                    break;
                case 2:
                    Deposit.deposit();
                    break;
                case 3:
                    CheckBalance.checkBalance();
                    break;
                case 4:
                    return;
            }
        }

    }
}




















