package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введіть число");
        int number =scanner.nextInt();
        scanner .close();
        if (isPalindrome(number)){
            System.out.println("Число" + number +"Являється паліндромом");
                    } else {
            System.out.println("Число"+number + "не являється паліндромом");
        }
    }
    public  static boolean
    isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0 );{
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 +remainder;
            number /= 10;
        }
        return originalNumber == reversedNumber;


        }

    }

