
/* Selection sort means selecting the minimum and swap.
 */
public class SelectionSort {


    public static void main(String[] args) {
    
        int arr[] = {13, 46, 24, 52, 20, 9};


        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

    }
    System.out.println("After selection sort:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

}}


