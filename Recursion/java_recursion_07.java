//first occurence 
public class java_recursion_07 {
    
    public static int firstOccurence(int arr[], int key, int i)
    {
        
        if(i == arr.length)
        {
            return -1;
        }

        if(arr[i] == key)
        {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){

        int arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println("first occurence of element in array: "+firstOccurence(arr, 5, 0));

    }
}
