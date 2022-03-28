package homeworkweek8;

import java.util.Locale;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.VovelCheck();
    }


    public void VovelCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        String a = scan.nextLine();
        String b = a.toLowerCase(Locale.ROOT);
        if (b.length() == 1) {
            char ch = b.charAt(0);
            boolean flag = Character.isAlphabetic(ch);
            if (b.length() == 1 && flag) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    System.out.println(ch + " is a Vovel");
                else
                    System.out.println(ch + " is  a Consonant");
            } else
                System.out.println(" Invalid Number");
        }
    }
}

