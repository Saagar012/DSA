
/*
 * pushes the maximum to the last by adjacent swaps.
 * Th time complexity will be O(n2)
 */

public class BubbleSort {

    public static void main(String[] args) {
    

        int arr[] = {52, 13, 46, 24, 20, 9};

        for(int i = arr.length-1; i >= 1; i-- ){
            for(int j = 0; j <= i - 1; j++){
                if (arr[j] > arr[j+1] ) {
                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(" ___________________--");
        for (int i : arr){
            System.out.print(i + " ");
        }

    }
    
}
