package practical;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Lengch of triangle");
        int length = scanner.nextInt();
        for (int i = length; i <= 0; i--)
        {
            System.out.print("*");

            for (int a = 0; a < i; a++) ;
        }
            System.out.print(" ");

    }
}

}