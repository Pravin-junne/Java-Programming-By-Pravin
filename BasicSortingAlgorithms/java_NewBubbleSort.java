public class java_NewBubbleSort {
    ///new bubble sort program
    public static void bubbleSort(int arr[]){
        //bubble sort logic
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
