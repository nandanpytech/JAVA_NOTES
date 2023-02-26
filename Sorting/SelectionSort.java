package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={2,3,1,4,5};
        Selectionsort(arr);
    }
    static  void  Selectionsort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int findMaxIndex(int[]arr,int start,int last){
        int maxone=start;
        for (int i = start; i <=last; i++) {
            if(arr[i]>arr[maxone]){
                maxone=i;
            }
        }
        return maxone;
    }

    static void swap(int[]arr,int index,int last){
        int temp=arr[index];
        arr[index]=arr[last];
        arr[last]=temp;
    }
}
