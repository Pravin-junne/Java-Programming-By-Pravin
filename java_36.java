public class java_36 {

    public static void revers(int number[]){
        int first=0, last = number.length-1;

        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){

        int numbers[]={1,2,3,4,5};
        revers(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
