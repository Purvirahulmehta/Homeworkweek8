package homeworkweek8;

import java.util.Scanner;

public class Question9 {
    public void Fibonaaci(int num) {
        int n1 = 0;//0+1=1,1+1=2,2+1=3....n
        int n2 = 1;
        int num1;
        System.out.println(n1 + "\t" + n2);
        if (num < 40) {
            for (int i = 0; i <= num; i++) {
                num1 = n1 + n2;
                System.out.println("\t" + num1);
                n1 = n2;
                n2 = num1;
            }
        } else {
            System.out.println("Given number is out of scoop");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int inputenum = obj.nextInt();
        Question9 OBJ = new Question9();
        OBJ.Fibonaaci(inputenum);
    }
}

