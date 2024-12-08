import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number;
        
        // Check if command-line arguments are provided
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        }
        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
