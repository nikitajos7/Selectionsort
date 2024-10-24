import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            arr[i] = (int) (Math.random() * 10000);
        }
        
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
       boolean isSwapped = true;
       int n = arr.length;
       // runs through the entire array until everything is sorted
       while(isSwapped) {
        isSwapped = false;
        for (int i = 0; i < n - 1; ++i) {
            // checks if the two values next to each other are in order
            if (arr[i] > arr[i + 1]) {
                swap(i, i + 1, arr);
                isSwapped = true;
            }
        }
       }
    }

    public static void swap(int i, int lowestIndex, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[lowestIndex];
        arr[lowestIndex] = temp;
    }
}
