package homeworkweek8;

import java.util.Scanner;

    public class ArmstrongNumber {
        public static void main(String[] args) {
            ArmstrongNumber obj = new ArmstrongNumber();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any number");
            int numArm = scan.nextInt();
            System.out.println(obj.isArmStrongNumber(numArm));
        }

        public String isArmStrongNumber(int a) {
            double sum = 0;
            int digit = 0;
            int last = 0;
            String message;
//finding the length of the given number
            int temp = a;
            while (temp > 0) {//finding length of given number
                temp = temp / 10;
                digit++;
            }
            temp = a;
            while (temp > 0) {
                last = temp % 10;//finding last digit
                sum = sum + (Math.pow(last,digit));
                temp = temp / 10;//removing last digit
            }
            // C0mparing the sum with original input
            if (a == sum)
                message = "Given Number is Armstrong Number";
            else
                message = "Given Number is not Armstrong Number";
            return message;
        }
    }






