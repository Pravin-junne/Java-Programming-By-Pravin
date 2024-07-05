//Basic array program to understand working of an array..
import java.util.*;
public class java_27 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4]; //array declaration
        System.out.print("Length of an Array:-" + marks.length);
        System.out.print("Enter the Marks of 4 subject:-");
        //input in array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        //array output by using for loop
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Marks of Subject "+(i+1)+" :"+marks[i]);
        }
    }
}
