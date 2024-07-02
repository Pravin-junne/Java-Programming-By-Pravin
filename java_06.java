//program to get table of gien number
import java.util.*;
public class java_06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
