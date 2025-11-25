//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // below are going to be all the final messages/fortunes
        String fortune1 = "You will have a good day!";
        String fortune2 = "You will have a bad day...";
        String fortune3 = "I see sunshine and rainbows in your future!";
        String fortune4 = "Good luck! You're going to need it...";
        String fortune5 = "Your dreams will come true!";
        String fortune6 = "Stormy clouds coming your way...";
        String fortune7 = "Maybe save that bucket list for later...";
        String fortune8 = "Today will be a productive day!";

        String message;

        // this is used to choose a random letter to be the special character
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("                          Fortune Teller");

        System.out.println("-----------------------------------------------------------------------");

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "! Let us tell your fortune...");

        System.out.println("-----------------------------------------------------------------------");
        System.out.print("First pick a number  1 or 2... ");
        int round1 = scan.nextInt();
        scan.nextLine();
        // below I am asking the questions and will give the user a fortune according to the responses they gave
        if (round1 == 1)
        {
            System.out.print("Next pick red or orange: ");
            String round2 = scan.nextLine().toLowerCase();
            if (round2.equals("red"))
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {
                    System.out.print("Your fortune is... ");
                    message = fortune1;
                    System.out.println(fortune1);
                }
                else
                {
                    System.out.print("Your fortune is... ");
                    message = fortune2;
                    System.out.println(fortune2);
                }
            }
            else
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {
                    System.out.print("Your fortune is... ");
                    message = fortune3;
                    System.out.println(fortune3);
                }
                else
                {
                    System.out.print("Your fortune is... ");
                    message = fortune4;
                    System.out.println(fortune4);
                }
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
                {
                    System.out.print("Your fortune is... ");
                    message = fortune5;
                    System.out.println(fortune5);
                }
                else
                {
                    System.out.print("Your fortune is... ");
                    message = fortune6;
                    System.out.println(fortune6);
                }
            }
            else
            {
                System.out.print("Next pick left or right: ");
                String round3 = scan.nextLine().toLowerCase();
                if (round3.equals("left"))
                {
                    System.out.print("Your fortune is... ");
                    message = fortune7;
                    System.out.println(fortune7);
                }
                else
                {
                    System.out.print("Your fortune is... ");
                    message = fortune8;
                    System.out.println(fortune8);
                }
            }
        }

        System.out.println("-----------------------------------------------------------------------");

        int index = (int) ((Math.random() * 25) + 1);
        String specialCharacter = alphabet.substring(index,index + 1);

        System.out.println("Your special character is ... " + specialCharacter + "!! This means this character is worth more points!");
        System.out.println("Now... time to determine your score...");

        System.out.println("-----------------------------------------------------------------------");

        int consonantPoints = (int) ((Math.random() * 3) + 1);
        int vowelPoints = (int) ((Math.random() * 10) + 1);
        int punctuationPoints = (int) ((Math.random() * 4) + 1);
        int specialCharPoints = vowelPoints + 2;

        System.out.println("The consonants are worth: " + consonantPoints + " points");
        System.out.println("The vowels are worth: " + vowelPoints + " points");
        System.out.println("Punctuation is worth: " + punctuationPoints + " points");
        System.out.println("Your special character is worth: " + specialCharPoints + " points");

        System.out.println("-----------------------------------------------------------------------");

        int score = Methods.score(message, consonantPoints, vowelPoints, punctuationPoints, specialCharacter, specialCharPoints);
        System.out.println("Your score is: " + score);
        System.out.println("-----------------------------------------------------------------------");
    }
}