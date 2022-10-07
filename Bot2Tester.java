
/**
 * Write a description of class Bot2Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("Hello. What is your name? ");
       String usersName = input.nextLine();
       Bot2 chatbot = new Bot2(usersName);
       chatbot.greeting();
       System.out.println("What is your favorite animal?");
       String favAnimal = input.nextLine();
       System.out.println();
       chatbot.favoriteAnimal(favAnimal);
       System.out.println("Where do you live?");
       String userLives = input.nextLine();
       chatbot.home(userLives);
       System.out.println("What is your favorite number? ");
       int favNumber = input.nextInt();
       chatbot.favoriteNumber(favNumber);
       chatbot.goodbye();
    }
}
