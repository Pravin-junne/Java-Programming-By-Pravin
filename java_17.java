//ternary operator even odd number
import java.util.*;
public class java_17 {
    public static void main(String args[]){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = sc.nextInt();
        String type= (x%2 == 0)?"EVEN":"ODD"; //ternary logic
        System.out.print(type);
    }
}
