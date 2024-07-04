//program to check wheter the numbewr is prime or not
import java.util.*;
public class java_23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int number = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<=number-1; i++){//condition
            if(number%i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("The number is Prime.");
        }
        else{
            System.out.println("The number is not Prime.");
        }
    }
}
