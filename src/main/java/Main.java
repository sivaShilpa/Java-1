import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
    }

    private static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        int wordCounter = 0;
        String token = "";
        String output = "";

        StringTokenizer stringTokenizer = new StringTokenizer(input);

        while(stringTokenizer.hasMoreTokens()){
            token = stringTokenizer.nextToken();
            wordCounter++;

            if(wordCounter % 2 != 0){
                token = token.toUpperCase();
            }
            output += token + " ";
        }

        System.out.println(output);
    }

    private static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        int upper = 0;
        String string = scanner.nextLine();

        for(int i = 0 ; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
        }

        System.out.println("Number of uppercase letters: " + upper);
    }

    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Your name in uppercase is: " + name.toUpperCase());
    }
}
