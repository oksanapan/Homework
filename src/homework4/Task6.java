package homework4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();
        for (int i = 0; i < args.length; i++) ;
        {
            array[i] = random.nextInt(101) - 50;
        }
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) ;
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];

        }
    }
    System.out.println ( " Мінімальний елемент : "+ min);
    System.out.println ( " Максимальний елемент : "+ max);
}

}

