
/*
 * pushes the maximum to the last by adjacent swaps.
 */

public class BubbleSort {

    public static void main(String[] args) {
    

        int arr[] = {12,52,9,10,80};

        for(int i = arr.length-1; i >=1; i-- ){
            for(int j =0; j< i - 2; j--){
                if (arr[j] > arr[j+1] ) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }





    }
    
}
