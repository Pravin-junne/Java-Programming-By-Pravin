//package Recursion;

public class java_recursion_03 {
    //Recursion Method to calculate factorial
    public static int facto(int n){
        if(n == 0){
            return 1;
        }

        int fnum1 = facto(n-1);
        int fn = n* facto(n-1);
        return fn;
    }
  public static void main(String args[]){
    System.out.println(facto(5)); //Method call
  }  
}
