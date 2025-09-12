package Lab6;
import java.util.Arrays;
import java.util.Scanner;


public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int length, int index) {
        if (length == 0) {
            return;
        }
        if (index < length - 1) {
            if (arr[index] > arr[index+1]) {
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubble(arr, length, index+1);
        } else {
            bubble(arr, length-1, 0);
        }
    }
}
