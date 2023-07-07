package homework2;

public class Task1 {
    public static void main(String[] args) {
        String String1 = "This line that i want to cut, cause it is too; long";
        String String2 = String1.substring(0,35);
        String String3 = String2 + "  don’t " ;

        System.out.println(String1);
        System.out.println(String2);
        System.out.println(String3);
    }
}
