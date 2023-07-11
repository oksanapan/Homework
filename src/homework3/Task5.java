package homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);
        System.out.print("Введіть перше число");
        double number1 = scanner.nextDouble();
        System.out.print("Введіть друге число");
        double number2 = scanner.nextDouble();
        System.out.print("Введіть символ операції(+,-,*,/,%):");
        char operator =
                scanner.next().charAt(0);
        double result = operator == '+'?
                number1 + number2:
                operator == '-' ?
                number1 - number2:
                        operator == '*' ?
                number1 * number2:
                                operator == '/' ?
                number1 / number2:
                                        operator == '%' ?
                number1 % number2:
                                                0;
        System.out.println("Результат:" + result);

    }
}
