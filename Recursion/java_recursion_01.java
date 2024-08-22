//package Recursion;

public class java_recursion_01 {
    //Recursion method to print n to 1 number
    public static void printDecre(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecre(n-1);
    }
  public static void main(String args[]){
   printDecre(10); //Method call
  }  
}
