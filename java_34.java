import java.util.*;
public class java_34 {

    //method to get smallest number
    public static int smallestNumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){

        int numbers[]={10,20,30,40,50};
        System.out.println(smallestNumber(numbers));
    }
    
}
