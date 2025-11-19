//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //this is testing my score method
//        String message = "oh no";
//        System.out.println(Methods.score(message));

        // below are going to be all the final messages/fortunes
        String fortune1 = "";
        String fortune2 = "";
        String fortune3 = "";
        String fortune4 = "";
        String fortune5 = "";
        String fortune6 = "";
        String fortune7 = "";
        String fortune8 = "";



        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "! Let us tell your fortune...");
        System.out.println("First pick a number  1 or 2");
        int round1 = scan.nextInt();
        // 1 and 2 will have 2 separate question choices, i will then according to the number chosen, will use random to pick one of the 2 questions
        if (round1 == 1)
        {
            System.out.print("Next pick red or orange: ");
            String round2 = scan.nextLine().toLowerCase();
            if (round2.equals("red"))
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {}
                else
                {}
            }
            else
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {}
                else
                {}
            }
        }
        else
        {
            System.out.print("Next pick green or blue: ");
            String round2 = scan.nextLine().toLowerCase();
            if (round2.equals("green"))
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {}
                else
                {}
            }
            else
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {}
                else
                {}
            }
        }

    }
}