//Area of circul
import java.util.*;
public class java_13 {
    public static void main(String args[]){
        float rad, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circul:- ");
        rad = sc.nextFloat();

        area = 3.14f * rad * rad; //logic
        System.out.print("Area of circul: "+area);
        sc.close();
    }
}
