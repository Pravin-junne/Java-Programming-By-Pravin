//program to get factorial of a number
import java.util.*;
public class java_05 {
    public static void main(String args[]){
        int facto = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer:-");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            facto *= i;
        }
        System.out.print("Factorial is : "+ facto);
    }
}
