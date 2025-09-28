//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your birth month as an interger between 1 and 12?");

        if(in.hasNextInt())
        {

            int birthMonth = in.nextInt();
            if(birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                System.out.println("You entered an incorrect month value: " + birthMonth );
            }
        }
        else
        {
            String birthMonth = in.nextLine();
            System.out.println("You entered an incorrect month value: " + birthMonth );
        }
    }

}