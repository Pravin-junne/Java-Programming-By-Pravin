import java.util.*;
public class java_BubbleSort{
    //bubble sorting Method
    public static void Sort_bubble(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++)
        {
            for(int j=0; j<arr.length-1-turn; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int tem=0;
                    tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={5,4,3,2,1};//orignal array
     
        Sort_bubble(arr);
        System.out.println("Array after bubble sort:-");
        printArr(arr);
    }
}