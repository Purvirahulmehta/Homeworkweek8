package homeworkweek8;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Question6 obj = new Question6();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows :");
        int numberofRows = scan.nextInt();
        obj.printtriangle(numberofRows);
    }

    public void printtriangle(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
               // System.out.println("j");
              //  System.out.println();
             //   a++;
            }
            System.out.println();
        }

    }
}