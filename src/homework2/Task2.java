package homework2;

public class Task2 {

    public static void main(String[] args) {
        String String = "Testing, is my favourite job";
String word1 = String.split("\\s")[0];
        word1 = word1.replace(","," ");
        String word2 = String.split("\\s")[1];
        String word3 = String.split("\\s")[2];
        String word4 = String.split("\\s")[3];
        String word5 = String.split("\\s")[4];
        System.out.print("Слово1 = " + word1 + "Testing, is my favourite job = " + word1.length() + ".");
        System.out.print("Слово2 = " + word2 + "Testing, is my favourite job = " + word2.length() + ".");
        System.out.print("Слово3 = " + word3 + "Testing, is my favourite job  = " + word3.length() + ".");
        System.out.print("Слово4 = " + word4 + "Testing, is my favourite job  = " + word4.length() + ".");
        System.out.print("Слово5 = " + word5 + "Testing, is my favourite job  = " + word5.length() + ".");
        boolean result = word1.length() > word2.length() &&
                word1.length() > word3.length() &&
                word1.length() > word4.length() &&
                word1.length() > word5.length();
        System.out.println(true);
        System.out.println(result);
         }
}
