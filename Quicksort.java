import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        
        System.out.println(Arrays.toString(arr));

        // chooses a random value in the array and swaps with the last element
        int pivot = (int) (Math.random() * arr.length);

        swap(arr, pivot, arr.length - 1);

        quicksort(arr, 0 , arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int lowIndex, int highIndex) {

        // base case for recursive funciton
        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // looks for the two values to partition
        while (leftPointer < rightPointer) {
            while (pivot >= arr[leftPointer] && leftPointer < rightPointer) {
                ++leftPointer;
            }

            while (pivot <= arr[rightPointer] && leftPointer < rightPointer) {
                --rightPointer;
            }

            // swaps the two values to that the bigger numbers are on the right
            // and the smaller ones are on the left
            swap(arr, leftPointer, rightPointer);

        }

        // swaps the number stops at with the pivot to the pivot is now in
        // the correct position
        swap(arr, leftPointer, highIndex);


        // calls the quicksort method for both ends of the array
        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
