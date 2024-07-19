//insertion sort program
import java.util.*;
public class java_insertionSort {
    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    //display
    public static void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        insertionSort(arr);
        display(arr);
    }
}
