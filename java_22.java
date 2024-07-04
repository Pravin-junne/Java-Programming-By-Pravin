//revers of given number
import java.util.*;
public class java_22 {
    public static void main(String args[]){
        int number, remainder, revers=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();

        //LOGIC
        while(number > 0){
            remainder = number % 10;
            revers = revers * 10 + remainder;
            number = number/10;
        }

        System.out.print("revers of number: "+revers);
    }
}
