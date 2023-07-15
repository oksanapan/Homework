package homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] names = {"Петя","Маша", "Альона", "Федя", "Саша", "Антон"};
        int[] numbers = {10,12,14,16,18,20};
        String[] places = {"школа", "магазин", "храм", "тренажерний зал", "кіно", "поліклініка"};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введіть три числа від 0 до 5");
        int index1 =scanner.nextInt();
        int index2 =scanner.nextInt();
        int index3 =scanner.nextInt();
        if (index1 >= 0 && index1 <= 5 && index2 >= 0 && index2 <= 5 && index3 >= 0 && index3 <= 5) {
            String name = names[index1];
            String place =places[index2];
            int time =numbers [index3];
            System.out.println(name + "буде йти в" + "в" + time +":00");
        }else {
            System.out.println("Введені не коректні дані");

        }
    }
}
