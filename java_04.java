//check leap year or not
import java.util.*;

public class java_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter the Year: ");
        year = sc.nextInt();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not aleap Year");
                }
            }
            else{
                System.out.print("Leap Year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }
    }    
}
