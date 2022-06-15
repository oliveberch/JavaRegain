
//Program to implement calculator on two operands 
import java.util.Scanner;

public class Calc2Op {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println("Enter an operator (+, -, *, /, %): ");
        System.out.println("+ for ADDITION.");
        System.out.println("- for SUBSTRACTION.");
        System.out.println("* for MULTIPLICATION.");
        System.out.println("/ for DIVISION");
        System.out.println("% for REMAINDER");
        char operator = reader.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.println("Error! operator is not correct");
                reader.close();
                return;
        }
        System.out.println("Result of operation: " + result);
        reader.close();
    }
}
