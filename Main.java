//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //this is testing my score method
//        String message = "oh no";
//        System.out.println(Methods.score(message));

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "! Let us tell your fortune...");
        System.out.println("first pick a number  1 or 2");
        int round1 = scan.nextInt();
        // 1 and 2 will have 2 separate question choices, i will then according to the number chosen, will use random to pick one of the 2 questions

    }
}