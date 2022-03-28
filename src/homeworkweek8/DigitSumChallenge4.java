package homeworkweek8;

import java.util.Scanner;

public class DigitSumChallenge4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer Number :");
        int inputnum = scan.nextInt();
        System.out.println(sumDigits(inputnum));
    }

    public static int  sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int b = number % 10;
                sum = b + sum;
                number = number / 10;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}

