import java.util.Scanner;

class UserBankAcc {
    static int atm_no = 123456789;
    static int pin = 1234;
    static int Balance = 0;

}

public class ATMInterface extends UserBankAcc {

    static int Deposit, Withdraw;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your atm card no.");
        int card_no = s.nextInt();
        System.out.println("Enter your atm pin.");
        int atm_pin = s.nextInt();
        System.out.println();
        if (card_no == atm_no && atm_pin == pin) {
            System.out.println("Congratulations,Successfully logged in to ATM.");
            System.out.println();

            try {
                while (true) {
                    System.out.println();
                    System.out.println("Enter 1 to Deposit.");
                    System.out.println("Enter 2 to Withdraw.");

                    System.out.println("Enter 3 to Check Balance.");

                    System.out.println("Enter 4 to exit.");
                    System.out.println("Enter option");
                    int n = s.nextInt();
                    switch (n) {
                        case 1:
                            System.out.print("Enter the amount you want to deposit:");
                            Deposit = s.nextInt();
                            Balance = Balance + Deposit;
                            System.out.println(Deposit + "RS: Successfully deposited.");
                            break;

                        case 2:
                            System.out.print("Enter the amount you want to withdraw:");
                            Withdraw = s.nextInt();
                            if (Withdraw <= Balance) {
                                Balance = Balance - Withdraw;
                                System.out.println(Withdraw + "RS: Successfully Withdrawed.");

                            } else {
                                System.out.println("Insufficient Balance.");

                            }
                            break;
                        case 3:
                            System.out.println("Your balance is :" + Balance + "RS");
                            break;

                        case 4:
                            System.exit(0);

                        default:
                            System.out.println("Please choose valid option.");

                    }
                    // if (n == 1) {
                    // System.out.print("Enter the amount you want to deposit..");
                    // Deposit = s.nextInt();
                    // Balance = Balance + Deposit;
                    // System.out.println(Deposit + ": Successfully deposited.");
                    // } else if (n == 2) {
                    // System.out.print("Enter the amount you want to withdraw.");
                    // Withdraw = s.nextInt();
                    // if (Withdraw <= Balance) {
                    // Balance = Balance - Withdraw;
                    // System.out.println(Withdraw + ": Successfully Withdrawed.");

                    // } else {
                    // System.out.println("Insufficient Balance.");

                    // }
                    // } else if (n == 3) {
                    // System.out.println("Your balance is " + Balance);
                    // }

                    // else if (n == 4) {
                    // break;
                    // } else {
                    // System.out.println("Please choose valid option.");
                    // break;
                    // }

                }
            } catch (Exception e) {

            }

        } else {
            System.out.println("Pin no doesn't match with Card no.");
        }

    }

}
