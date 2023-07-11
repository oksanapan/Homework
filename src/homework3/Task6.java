package homework3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Оберіть програму(IntelliJ IDEA, Git, Java.):");
        String program = scanner.nextLine();
        System.out.print("Оберіть програму(Linux, macOS, Windows.):");
        String os = scanner.nextLine();
        String downloadLink;
        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {
                    case "Linux":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section = linux";
                        break;
                    case "macOS":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section = mac";
                        break;
                    case "Windows":
                        downloadLink = "https://www.jetbrains.com/idea/download/#section = Windows";
                        break;
                    default:
                        System.out.print("Такої ОС не існує.");
                        return;
                }
                break;
            case "Git":
                switch (os) {
                    case "Linux":
                        downloadLink = "https://gst-scm.com/download/ = linux";
                        break;
                    case "macOS":
                        downloadLink = "https://gst-scm.com/download/ = mac";
                        break;
                    case "Windows":
                        downloadLink = "https://gst-scm.com/download/ = Win";
                        break;
                    default:
                        System.out.print("Такої ОС не існує.");
                        return;
                }
                break;
            case "Java":
                switch (os) {
                    case "Linux":
                        downloadLink = "https://www.java.com/en/download/linux_manual.jsp";
                        break;
                    case "macOS":
                        downloadLink = "https://www.java.com/en/download/mac_manual.jsp";
                        break;
                    case "Windows":
                        downloadLink = "https://www.java.com/en/download/Win_manual.jsp";
                        break;
                    default:
                        System.out.print("Такої ОС не існує.");
                        return;
                }
                break;
            default:
                System.out.println("Такої ОС не існує.");
        }
        System.out.println("Посилання на скачування не існує:" );

    }
}