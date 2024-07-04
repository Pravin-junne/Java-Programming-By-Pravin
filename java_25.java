//product of two number using method
import java.util.*;
public class java_25 {
    //method to calculate product
    public static int multiplication(int a, int b)
    {
        int mult;
        mult = a*b;
        return mult;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,product;
        System.out.print("Enter the first number:- ");
        a = sc.nextInt();

        System.out.print("Enter the second number:- ");
        b = sc.nextInt();

        product = multiplication(a, b); //variable stores result

        System.out.print("Product of Two number:- "+product);
    }
}
