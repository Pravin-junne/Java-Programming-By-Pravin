//half pyramid of numbers
import java.util.*;
public class java_pattern_02 {
    public static void main(String args[]){
        int line = 10;

        for(int i=1; i<=line; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
