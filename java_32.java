public class java_32{

    public static int LinearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){


        int number[] = { 10,20,30,40};
        int key = 20; 

        int index = LinearSearch(number,key);
        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key found: "+index);
        }
    }
}
