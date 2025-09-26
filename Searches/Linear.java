package Searches;
import java.util.ArrayList;


public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 542, 6, 43, 735, 4, 25, 1, 21, 35, 2};

        ArrayList<Integer> arrs = new ArrayList<>();

        LS(69,arr,arrs);}


    static void LS(int target, int[] arr, ArrayList<Integer> rarr) {
        if (arr.length == 0) {
            System.out.println("nhi mila");
            return;
        }
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            rarr.add(arr[i]);
            if (arr[i] == target) {


                 result = arr[i];
            }
        }
        System.out.println(result);
        System.out.println(rarr);
        return;
    }
}
