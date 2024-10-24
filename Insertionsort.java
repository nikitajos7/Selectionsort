import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            arr[i] = (int) (Math.random() * 10000);
        }
        
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int temp;
        // iterates through the entire array and stores each values except the
        // the first as a temp
        for (int i = 1; i < n; ++i) {
            temp = arr[i];

            // sets the value to compare as one before the current temp
            int j = i - 1;

            // goes backwards through the entire array and checks to see if 
            // the temp value is smaller then the value it is being compared to
            while (j >= 0 && arr[j] > temp) {
                // if smaller then it moves the value being compared to down 
                // the array
                arr[j + 1] = arr[j];
                --j;
            }
            // inserts the temp value where it was no longer smaller than the
            // value it was being compared to
            arr[j + 1] = temp;
        }
    }
}
