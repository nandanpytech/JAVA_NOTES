package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=Merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] Merge(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=Merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=Merge(Arrays.copyOfRange(arr,mid,arr.length));

        return mergesort(left,right);
    }
    static int[] mergesort(int[]left,int[]right){
        int[] ans=new  int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length){
            if(left[i]<right[i]){
                ans[k]=left[i];
                i++;
            }else{
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            ans[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}
