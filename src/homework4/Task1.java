package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
                System.out.print("Введіть слово");
                word = scanner.nextLine();
                sentence.append(word).append(" ");
            } while (!word.equals("STOP"));
            System.out.println("Введіть слова:" + sentence.toString().trim());
        }
    }

