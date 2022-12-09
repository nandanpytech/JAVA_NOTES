package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={9,6,4,2,3,5,7,0,1};
        CyclicSort(nums);
    } static  void  CyclicSort(int[] arr){
        int i=0;
        while (i<arr.length){
            int realIndex=arr[i];
            if(realIndex<arr.length && arr[i]!=arr[realIndex]){
                swap(arr,i,realIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(checking(arr));
    }
    static List<Integer> checking(int[]arr){
        List<Integer> totalans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                totalans.add(i);
            }
        }
        return totalans;
    }

    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

}
