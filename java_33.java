import java.util.*;
public class java_33 {

    //method to get largest number
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){

        int numbers[]={10,20,30,40,50};
        System.out.println(largestNumber(numbers));
    }
    
}
