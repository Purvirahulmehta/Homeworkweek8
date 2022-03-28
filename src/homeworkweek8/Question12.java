package homeworkweek8;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is Prime number or not : ");
        int b = scan.nextInt();
        Question12 obj = new Question12();
        obj.primeNumber(b);
    }

    public void primeNumber(int a) {
        int result = 0;

        //Loop to check weather the number is divisable by any numbertocheck other then 1
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                result = 0;
                break;
            } else {
                result = 1;
            }
        }
        if (result == 0) System.out.println(a + " is not a Prime Number");
        else System.out.println(a + " is a Prime Number");
    }
}
