package homeworkweek8;

import java.util.Scanner;

public class ReadingUserInputChallenge1 {

    public static void main(String[] args) {
        ReadingUserInputChallenge1 obj = new ReadingUserInputChallenge1();
        obj.numberSum();
    }

    public void numberSum() {
        int count = 1;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while (count <= 10) {
            System.out.println("Enter number:" + count);

            boolean validnumber = scan.hasNextInt();
            if (validnumber) {
                int number = scan.nextInt();
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

    }

}





