//if - else voting program
import java.util.*;
public class java_14 {
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        x = sc.nextInt();
        
        if(x>=18){
            System.out.print("Adult: You can vote.");
        }
        else{
            System.out.print("Sorry you can not vote.");
        }
    }
}
