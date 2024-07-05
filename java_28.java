//updating array value by using Method
import java.util.*;
public class java_28 {
    //Method to update value in array
    public static void updateArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i] + 10;
        }
    }
    public static void main(String args[]){
        int arr[] = {90,90,90,90};  //array declaration
        //Method call
        updateArr(arr);
        //print updated array elements
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Udated elements in array by 10:"+arr[i]);
        }
    }
}
