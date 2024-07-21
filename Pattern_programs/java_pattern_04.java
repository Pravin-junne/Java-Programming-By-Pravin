import java.util.*;
public class java_pattern_04 {
    
    public static void main(String args[]){
        char ch = 'A';
        int line = 7;

        for(int i=1; i<=line; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
