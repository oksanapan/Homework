package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String string1 = scanner.next("Я");
       String string2 = scanner.next("тестирую");
       String string3 = scanner.next("замечательно" );
       String string4 = scanner.next("Что еще нужно?");
        System.out.println("string1:"+ string1 );
        System.out.println("string2:"+ string2);
        System.out.println("string3:"+ string3);
        System.out.println("string4:"+ string4);
    }
}
