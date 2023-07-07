package practical;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0 && x < 15)
            System.out.println("x");
    }
}
//Пользователь вводит с клавиатуры число. Если оно четное и меньше 15, то в консоль выводится сообщение:
//Число четное и меньше 15.
//Если оно четное и больше 15, то в консоль выводится сообщение:
//Число четное и больше 15.
//В противном случае выводится сообщение:
//Число нечетное.