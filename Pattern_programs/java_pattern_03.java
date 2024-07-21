import java.util.*;

public class java_pattern_03{

    public static void main(String args[]){
        int line = 10;

        for(int i=1; i<=line; i++){
            for(int j=1; j<=line-i+1; j++){  //logic (n-i+1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}