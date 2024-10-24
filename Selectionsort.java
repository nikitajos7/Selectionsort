import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            arr[i] = (int) (Math.random() * 10000);
        }
        
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int lowestIndex = 0;

        int n = arr.length;
        // iterates thorugh each number in the array
        // and compares them to each value
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                // if the computer finds a value lower than the one it is 
                // comparing it to then it will store that as the lowest value
                if (arr[lowestIndex] > arr[j]) {
                    lowestIndex = j;
                }
            }
            swap(i, lowestIndex, arr);
            // if there are no changes in the value of lowestIndex then it
            // changes the value to the next value
            lowestIndex = i + 1;
        }
    }

    public static void swap(int i, int lowestIndex, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[lowestIndex];
        arr[lowestIndex] = temp;
    }
    
}