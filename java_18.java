//pass or fail program with ternary oprator
import java.util.*;
public class java_18 {
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:- ");
        x = sc.nextInt();

        String result = (x >= 35) ? "PASS" : "FAIL";
        System.out.print("result: "+result);
    }
}
