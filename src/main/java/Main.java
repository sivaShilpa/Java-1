import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Your name in uppercase is: " + name.toUpperCase());
    }
}
