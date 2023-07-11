package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число");
        int number1 = scanner.nextInt();
        System.out.print("Введіть друге число");
        int number2 = scanner.nextInt();
        int difference = number1 > number2 ? number1 - number2: number2 - number1;
        System.out.print("Різниця:"+difference);


    }
}
