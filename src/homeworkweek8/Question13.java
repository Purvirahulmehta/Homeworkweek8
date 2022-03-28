package homeworkweek8;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int x =scan.nextInt();
        System.out.println("Enter second number");
        int y= scan.nextInt();
       // Question13.hasSharedDigit(x,y);
        System.out.println(hasSharedDigit(x,y));

    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        while (a > 0) {
            int lastDigit1 = a % 10;
            int lastdigit2 = b % 10;
            int firstdigit1 = a / 10;
            int firstdigit2 = b / 10;
            if ((lastDigit1 == lastdigit2) || (lastDigit1 == firstdigit2) || (firstdigit2 == lastDigit1) || (firstdigit1 == lastdigit2)) {
                return true;
            }
            a /= 10;
            b /= 10;
        }
        return false;
    }
    }


