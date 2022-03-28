package homeworkweek8;

import java.util.Scanner;

public class EvenDigitSum11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Numbers");
        int numSumEven = scan.nextInt();
        if (getEvenDigitSum(numSumEven) != 1) {
            System.out.println("The sum of even digits of the given number(" + numSumEven + ")is :" + getEvenDigitSum(numSumEven));
        } else {
            System.out.println("Invalid Input" + getEvenDigitSum(numSumEven));
        }
    }

    public static int getEvenDigitSum(int number) {
        int lastdigit;
        int sum = 0;
        if (number > 0) {
            while (number > 0) {
                lastdigit = number % 10;
                if (lastdigit % 2 == 0) {
                    sum = sum + lastdigit;
                }
                number = number / 10;

            }

        } else {
            sum = -1;
        }
        return sum;
    }
}


