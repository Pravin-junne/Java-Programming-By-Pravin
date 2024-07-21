//inbuilt sorting
import java.util.*;
public class java_inbuiltSort {
    public static void main(String args[]){
        int arr[]={5,4,3,2,1}; //array

        Arrays.sort(arr,Collections.reverseOrder());   //inbuilt metod to sort an array 1.[Arrays.sort(Array)]
                            //Arrays.sort(Array,si,ei);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
