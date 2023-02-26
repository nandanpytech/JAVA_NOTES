package Sorting;

import java.util.Arrays;
import java.util.List;

public class Rankarray {
    public static void main(String[] args) {
        int[]arr={37,12,28,9,100,56,80,5,12};
        int[]nums=Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(nums); //[10,20,30,40]
        int[]ans=new  int[arr.length];
        int j=0,k=0;
        for (int i = 0; i < nums.length; i++) {
            int index=check(nums,arr[j++]);
            ans[k++]=index+1;
        }
        System.out.println(Arrays.toString(ans));

    }
    static int check(int[]arr,int n){
        int s=0;
        while (s<arr.length){
            if(s>0 && arr[s]==arr[s-1]){
                s--;
            }
            if(arr[s]==n){
                return s;
            }
            s++;
        }
        return -1;
    }
}
