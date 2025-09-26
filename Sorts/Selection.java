package Sorts;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 5, 23, 24, 56, 71, 243, 2, 4, 45};
        Sort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int i, int j, int max) {

        if (i == arr.length - 1) {
            return;
        }

        if (j < arr.length) {
            if (arr[j] < arr[max]) {
                Sort(arr, i, j + 1, j);
            } else {
                Sort(arr, i, j + 1, max);
            }
        } else {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;

            Sort(arr, i + 1, i + 1, i + 1);
        }
    }
}
