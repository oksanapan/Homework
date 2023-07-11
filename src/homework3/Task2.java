package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину першої сторони");
        int side1 = scanner.nextInt();
        System.out.print("Введіть довжину другої сторони");
        int side2 = scanner.nextInt();
        System.out.print("Введіть довжину третьої сторони");
        int side3 = scanner.nextInt();
        boolean isTriangle = (side1 +side2 > side3)&&(side1 +side3 > side2);
         if (isTriangle) {
             System.out.print("Можна побудувати трикутник");


         } else {
             System.out.print("Не можна побудувати трикутник");
    }

    }
}
