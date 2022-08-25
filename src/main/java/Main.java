import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
        ex7();
    }

    private static void ex7() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.println("Enter first number: ");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter second number: ");
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter operation (add, sub, mul, div): ");
        String operation = scanner.nextLine();

        if(operation.equals("add")){
            result = firstNum + secondNum;
            System.out.println("Result: " + result);
        } else if (operation.equals("sub")) {
            result = firstNum - secondNum;
            System.out.println("Result: " + result);
        } else if (operation.equals("mul")) {
            result = firstNum * secondNum;
            System.out.println("Result: " + result);
        } else if (operation.equals("div")) {
            result = firstNum/secondNum;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Wrong operation entered.");
        }

    }

    private static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = firstNum + secondNum;
        System.out.println("Result: " + result);

    }

    private static void ex5() {
        Scanner scanner = new Scanner(System.in);
        String stopWord = "quit";
        String isquit = " ";

        while(isquit != stopWord){
            System.out.println("Enter a string: ");
            String string = scanner.nextLine();

            if(!string.toLowerCase().equals(stopWord)){
                int vowelCount = 0;
                int consonantCount = 0;
                char[] stringArray = string.toLowerCase().toCharArray();
                for(int i = 0; i < stringArray.length; i++){
                    if(stringArray[i] == 'a' || stringArray[i] == 'e' || stringArray[i] == 'i' ||
                            stringArray[i] == 'o' || stringArray[i] == 'u'){
                        vowelCount++;
                    }
                    else if(stringArray[i] == 'b' || stringArray[i] == 'c' || stringArray[i] == 'd' ||
                            stringArray[i] == 'f' || stringArray[i] == 'g' || stringArray[i] == 'h' ||
                            stringArray[i] == 'j' || stringArray[i] == 'k' || stringArray[i] == 'l' ||
                            stringArray[i] == 'm' || stringArray[i] == 'n' || stringArray[i] == 'p' ||
                            stringArray[i] == 'q' || stringArray[i] == 'r' || stringArray[i] == 's' ||
                            stringArray[i] == 't' || stringArray[i] == 'v' || stringArray[i] == 'w' ||
                            stringArray[i] == 'x' || stringArray[i] == 'y' || stringArray[i] == 'z') {
                        consonantCount++;
                    }
                }
                System.out.println("Number of Vowels: " + vowelCount);
                System.out.println("Number of Consonants: " + consonantCount);
            }
            else{
                isquit = stopWord;
            }
        }
    }

    private static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check if palindrome: ");
        String input = scanner.nextLine();
        char[] inputArray = input.toLowerCase().toCharArray();
        String isPalindrome = "NO";

        int i = 0;
        while(i < input.length()/2){
            if(inputArray[i] == inputArray[(input.length()-1)-i]){
                isPalindrome = "YES";
            }
            else{
                isPalindrome = "NO";
                break;
            }
            i++;
        }

        System.out.println(isPalindrome);
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
