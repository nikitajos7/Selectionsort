import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] arr = new int[10];
        
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        
        System.out.println(Arrays.toString(arr));

       mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        // return if the array is fully divided
        if (n < 2) {
            return;
        }

        int midpoint = n / 2;
        int[] leftHalf = new int[midpoint];
        int[] rightHalf = new int[n - midpoint];

        
        for (int i = 0; i < midpoint; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midpoint; i < n; i++) {
            rightHalf[i - midpoint] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(leftHalf, rightHalf, arr);
    }

    private static void merge(int[] leftHalf, int[] rightHalf, int[] arr) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int i = 0, j = 0, k = 0;

        // compares the values of the two arrays and adds the to the array 
        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // adds any extra values to the end of the array
        while (i < leftLength) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    
}
