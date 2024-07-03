//switch simplae calculator
import java.util.*;
public class java_19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int a = sc.nextInt();

        System.out.println("Enter the second number:- ");
        int b = sc.nextInt();

        System.out.println("Enter the oprator:- ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+': System.out.print("Addition = "+ (a+b));
            break;

            case '-': System.out.print("Subtraction = "+(a-b));
            break;

            case '*': System.out.print("Multiplication = "+(a*b));
            break;

            case '/': System.out.print("Division = "+(a/b));
            break;

            case '%': System.out.print("Modulo = "+(a%b));
            break;

            default: System.out.print("Wrong oprator");
        }
    }
}
