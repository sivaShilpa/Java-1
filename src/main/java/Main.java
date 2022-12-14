import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
        ex10();
    }

    private static void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(string);

        char[] stringArray;
        String stringWord = "";

        while(stringTokenizer.hasMoreTokens()){
            stringWord = stringTokenizer.nextToken();
            stringArray = stringWord.toCharArray();
            String spaces = "";

            for(int i = 0; i < stringArray.length; i++){
                System.out.println(spaces + stringArray[i]);
                spaces += " ";
            }
        }

    }

    private static void ex9() {
        Random random = new Random();
        int randomNum = random.nextInt(6);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int enteredNum = scanner.nextInt();

        while(enteredNum != randomNum){
            System.out.println("Try again...");
            System.out.println("Enter a number: ");
            enteredNum = scanner.nextInt();
        }
        System.out.println("You guessed it!!!");
    }

    private static void ex8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price per square feet: ");
        float pricePerSqft = Float.parseFloat(scanner.nextLine());
        float dimensionsInFloat = 0.0F;


        while(true){
           System.out.println("Enter room dimensions (width x height): ");
           String dimensions = scanner.nextLine();
           if(dimensions.equals("done")){
               break;
           }
           String width = "";
           String height = "";
           StringTokenizer stringTokenizer = new StringTokenizer(dimensions);
           ArrayList<String> tokens = new ArrayList<>();
           int counter = 0;

           while(stringTokenizer.hasMoreTokens()){
               tokens.add(stringTokenizer.nextToken());
           }

           width = tokens.get(0);
           height = tokens.get(2);
//           char[] dimensionsArray = dimensions.toCharArray();
//           for(int i = 0; i < dimensions.length(); i++){
//               if(dimensionsArray[i] != 'x'){
//                   width += dimensionsArray[i];
//               }
//               else{
//                   i++;
//                   height += dimensionsArray[i];
//               }
//           }
           dimensionsInFloat += (Float.parseFloat(width) * Float.parseFloat(height));
       }

        System.out.println("Total cost: " +
                NumberFormat.getCurrencyInstance(Locale.US).format(dimensionsInFloat*pricePerSqft));
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
