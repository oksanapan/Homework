package homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вмістимість складу (вагу):");
        int capacity = scanner.nextInt();
        int remainingCapacity = capacity;
        int metalWeight = 0;
        while (remainingCapacity > 0) {
            System.out.print("Введіть вагуетала для здачі:");
            metalWeight = scanner.nextInt();
            if (metalWeight < 5) {
                System.out.println("Неможливо прийняти метал вагою менше 5");
                continue;
            }
            if (metalWeight > remainingCapacity) ;
            System.out.println("Неможливо прийняти метал.Не достатньовільного місця на складі");
            break;
        }
        remainingCapacity -= metalWeight;
        System.out.println("Прийнято" + metalWeight + " кг метала.Остача вільного місця на складі: " + remainingCapacity + "кг");
        System.out.println("Місце на складі закінчилося. Програма завершина");

    }
        }



