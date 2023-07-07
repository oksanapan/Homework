package homework2;

import java.io.OptionalDataException;

public class Task3 {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character ‘a’ occurs there. And we can use the split method and the length method.";
        String[] words = text.split("\\s ");

        String string = "Completely random text in English. In it, we just need to determine how many times the character ‘a’ occurs there. And we can use the split method and the length method.";
        String[] strings = string.split("a");
        System.out.println(strings.length);
        System.out.println(strings.length-1);
        
    }
}