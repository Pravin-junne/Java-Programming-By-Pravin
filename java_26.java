//factorial of a number
import java.util.*;
public class java_26 {
    //Method to calculate the factorial
    public static int factorial(int n)
    {
        int facto = 1;
        for(int i=1; i<=n; i++)
        {
            facto = facto * i;
        }
        return facto;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        System.out.print("Factorial of a number:- "+factorial(n));//function call
    }
}
