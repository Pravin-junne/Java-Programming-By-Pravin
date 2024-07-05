//program to check largest and smallest value from array..
import java.util.*;
public class java_29 {
    public static int getLargest(int data[])
    {
        int largest = Integer.MIN_VALUE;    //- infinity variable
        int smallest = Integer.MAX_VALUE;   //+ infinity variable
        //loop logic
        for(int i=0; i<data.length; i++)
        {
            if(largest < data[i])
            {
                largest = data[i];
            }

            if(smallest > data[i])
            {
                smallest = data[i];
            }
        }
        System.out.println("Smallest value in array: "+smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int data[] = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("Largest value in array : "+ getLargest(data));

    }
}
