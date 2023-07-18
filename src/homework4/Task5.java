package homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) ;
        {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число");
        int userInput = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == userInput) {
                found = true;
                break;
            }
        }
            if (found) {
                System.out.println("Число" + userInput + "найдено в масиві");

            } else {
                System.out.println("Число" + userInput + " не знайдено в масиві");
            }
        }
    }









