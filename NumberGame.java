import java.util.*;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int attempt = 1;
        Random robj = new Random();
        int num1 = robj.nextInt(101);
        
        Scanner sobj = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.print("Enter your guessed no: ");
            int ipnum = sobj.nextInt();

            if (ipnum == num1) {
                System.out.println("Congratulations you are correct.");
                break;

            } else if (ipnum < num1) {
                System.out.println("Entered no is smaller.");
            } else if (ipnum > num1) {
                System.out.println("Entered no is larger..");
            }
            i++;

            if (attempt >= 8) {
                System.out.println("Sorry, please try again.");
                break;
            }
            attempt++;

        }
        System.out.println("Your score is " + (100 - ((attempt-1) * 10)));

        System.out.println("You tried " + attempt + " times");

    }

}
