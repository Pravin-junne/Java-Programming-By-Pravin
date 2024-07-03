//program to check even or odd number
import java.util.*;
public class java_07 {
    public static boolean isEven(int x){
        if(x%2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int x = sc.nextInt();

        if(isEven(x)){
            System.out.print("The number is EVEN");
        }
        else{
            System.out.print("The number is ODD");
        }
    }
}
