//average of three number
import java.util.*;
public class java_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    //scanner

        System.out.println("Enter the first number:-");
        int a = sc.nextInt();

        System.out.println("Enter the Second number:-");
        int b = sc.nextInt();

        System.out.println("Enter the third number:-");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;    //logic

        System.out.println("Average is : "+avg);
    }
}
