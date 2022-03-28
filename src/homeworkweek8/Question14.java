package homeworkweek8;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Question14.test();
    }

    public static void test() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int n = scan.nextInt();
        System.out.println("Enter Symbol:");
        char c = scan.next().charAt(0);
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n-i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 -1) {
                System.out.print(c);
            }
            System.out.println("");
            i++;
        }
        i = n-1;
        while(i>0){
            j=1;
            while(j++ <= n-i){
                System.out.print(" ");
            }
              j=1;
            while (j++<= i*2-1 ){
                System.out.print(c);
            }
            System.out.println();
            i--;
        }

    }
}
