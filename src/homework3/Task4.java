package homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число");
        int number = scanner.nextInt();
        if (number == 1){
            System.out.print("Понеділок");

            } else if (number == 2){
            System.out.print("Вівторок");
        } else if (number == 3){
            System.out.print("Середа");
        } else if (number == 4){
            System.out.print("Четвер");
        } else if (number == 5){
            System.out.print("П`ятниця");
        } else if (number == 6){
            System.out.print("Субота");
        } else if (number == 7){
            System.out.print("Неділя");
        } else {
            System.out.print("Краще б сьогодні була п`ятниця");
        }
    }
}

