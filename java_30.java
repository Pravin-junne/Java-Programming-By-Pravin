//Revers an array program
import java.util.*;
public class java_30 {
    //Method to revers an array
    public static void revArr(int number[])
    {
        int first = 0, last = number.length - 1;
        for(int i = first; i<last; i++)
        {
            //swap logic
            int temp=0;
            temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            //updation
            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        int number[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Origal array elements:");
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
        
        System.out.println();

        revArr(number); //Method call
        //print reversed array
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
    }
}
