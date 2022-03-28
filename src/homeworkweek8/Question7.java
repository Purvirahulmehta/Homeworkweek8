package homeworkweek8;

import java.util.Scanner;

public class Question7 {
    public static int sumFirstAndLastDigit(int number){
        int First_Digit = 0;
        int Last_Digit = number%10;
        int Sum = 0;
        while (number!=0) {
            int a = number % 10;
            Sum = a;
            number = number / 10;
        }
        return Last_Digit+Sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        System.out.println(sumFirstAndLastDigit(num));

    }
}
