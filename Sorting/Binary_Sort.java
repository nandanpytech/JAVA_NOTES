package Sorting;

import java.util.Arrays;

public class Binary_Sort {
    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        binarysort(arr);
    }
    static void binarysort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(j!= arr.length && arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
