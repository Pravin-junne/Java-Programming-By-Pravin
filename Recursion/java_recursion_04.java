//package Recursion;

public class java_recursion_04 {
    //Recursion Method to calculate sum of natural numbers
    public static int calSumN(int n){
        if(n==1){
            return 1;
        }
        int sumN = calSumN(n-1);
        int totalSumN = n+sumN;
        return totalSumN;
    }
    public static void main(String args[]){
        System.out.println(calSumN(5)); //Method call 
    }
}
