package homeworkweek8;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer Number :");
        int inputnumber = scan.nextInt();
        System.out.println(isPalindrome(inputnumber));
    }

public static boolean isPalindrome(int number) {
    int a = 0;
    int originalNunber = number;
    while (number != 0) {
        int lastDigit = number % 10;
        a = (a * 10) + lastDigit;
        number /= 10;
    }
    return originalNunber == a;
    }
}
