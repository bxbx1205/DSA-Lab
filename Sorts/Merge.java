package Sorts;
import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {

        int[] arr = {5,235,8,26,23,6,123,5,4,13,5,2463,7,534,2,1};
        arr = sorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] sorting(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left= sorting(Arrays.copyOfRange(arr,0,mid));
        int[] right= sorting(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< first.length && j < second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
            while (i< first.length){
                mix[k]=first[i];
                i++;
                k++;
            }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
            return mix;

    }

}
