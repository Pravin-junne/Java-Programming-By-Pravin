//pairs in array
import java.util.*;

public class java_31{
    //method to do pairing of an elements in array
    public static void PrintPairs(int numbers[]){
        int tp = 0; // to count number of pairs

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs:"+tp);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        PrintPairs(numbers);
    }
}