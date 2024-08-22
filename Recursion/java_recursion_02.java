//package Recursion;

public class java_recursion_02 {
    //Recursion method to print 1 to n
    public static void printinc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }

        printinc(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        printinc(5); //Method call
    }  
}
