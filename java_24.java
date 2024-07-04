//program to do swap operation
import java.util.*;
public class java_24 {
    //method to swap the numbers
    public static void swap(int a, int b)
    {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of (A) after swap:-"+a);
        System.out.println("Value of (B) after swap:-"+b);
    }
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of (A):- ");
        a = sc.nextInt();
        System.out.print("Enter the value of (B):- ");
        b = sc.nextInt();

        System.out.println("-------------------------------");
        System.out.println("The initial value of (A):- "+a);
        System.out.println("The initial value of (B):- "+b);
        
        System.out.println("-------------------------------");

        swap(a, b);
    }
}
