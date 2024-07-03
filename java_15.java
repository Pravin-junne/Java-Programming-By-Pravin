//program to check greater number
import java.util.*;
public class java_15 {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first(a) number:- ");
        a = sc.nextInt();
        System.out.print("Enter the second(b) number:- ");
        b = sc.nextInt();
        if(a>b){
            System.out.print("a is grater than b");
        }
        else if(a == b){
            System.out.print("a equal to b");
        }
        else{
            System.out.print("b is greater than a");
        }
    }
}
