package homeworkweek8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Right Angled Triangle Pattern Rows :");
        int a = scan.nextInt();
        Question8 obj = new Question8();
        //obj.rightangletringle(int a);
       //this is the problem
        // System.out.println("Printing Right Angled Tringle");



    }
    public void rightangletringle(int a) {
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");

            }
            System.out.println();
        }
    }

}
