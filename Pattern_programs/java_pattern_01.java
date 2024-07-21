
import java.util.*;
public class java_pattern_01 {
    //half pyramid pattern
    public static void main(String args[]){
       // int line = 10;
        for(int line=1; line<=10; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
