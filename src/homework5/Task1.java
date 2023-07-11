package homework5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть своє ім`я:");
            String name = scanner.nextLine();
            System.out.println("Let hte game begin!");
            int secretNumber = random.nextInt(101); //Випадкове число від 1 до 100 ;
            int guess;
            while (true) {
                System.out.println("Введіть число");
                guess = scanner.nextInt();
                if (guess < secretNumber) {
                    System.out.println("Your number is too small.Please,try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Your number is too small.Please,try again.");
                } else {
                    System.out.println("Congratulations," + name + "!");
                    break;                }
                    };
                }
    }
}
