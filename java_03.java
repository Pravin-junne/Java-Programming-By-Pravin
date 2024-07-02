//program to check positive or negative numbers
import java.util.*;
public class java_03 {
     public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        x =  sc.nextInt();

        if(x>=0){//logic
            System.out.print("POSITIVE NUMBER");
        }
        else{
            System.out.print("NEGATIVE NUMBER");
        }
        sc.close();
     }
}
