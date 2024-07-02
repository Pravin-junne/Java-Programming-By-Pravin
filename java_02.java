//area of square
import java.util.*;
public class java_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square:-");
        float side = sc.nextFloat();

        float area = (side * side); //logic

        System.out.println("Area of Square:- "+ area);
        sc.close();
    }
}
