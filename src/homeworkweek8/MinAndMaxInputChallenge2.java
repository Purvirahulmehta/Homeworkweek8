package homeworkweek8;

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {
        MinAndMaxInputChallenge2 obj = new MinAndMaxInputChallenge2();
        obj.minmax();
    }


    public void minmax() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int max = 0;
        int min = 0;
        boolean result = true;
        while (true) {
            int cnt = count++;
            System.out.println("Enter a number :"+ (cnt+ 1) + " :");
            boolean isValid = scan.hasNextInt();
            if (isValid) {
                int num = scan.nextInt();

            if(result) {
                    result = false;
                    min = num;
                    max = num;
                }
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                } }else {
                    System.out.println("Invalid Input.");
                    break;
                }
                scan.nextLine();
            }
            System.out.println("min number :" + min);
            System.out.println("max number : " + max);
        }
        }



