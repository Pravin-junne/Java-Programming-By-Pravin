//if-else program to check even odd number
import java.util.*;
public class java_16 {
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        x = sc.nextInt();
        if(x%2 == 0){
            System.out.print("EVEN number");
        }
        else{
            System.out.print("ODD number");
        }
    }
}
