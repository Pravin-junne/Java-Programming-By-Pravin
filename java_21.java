//sum of 1 to n numbers
import java.util.*;
public class java_21 {
    public static void main(String args[]){
        int a, i=1, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        a = sc.nextInt();

        while(i<=a){
            sum += i;
            i++;
        }
        
        System.out.print("Sum of the number is: "+sum);
    }
}
