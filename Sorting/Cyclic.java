package Sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[]arr={1,3,5,6,5,3,8,7};
        CyclicSort(arr);
    }
    static void CyclicSort(int[]arr) {
       int i=0;
       while(i< arr.length){
           int realIndex=arr[i]-1;
               if(arr[i]!=arr[realIndex]){
                   swap(arr,i,realIndex);
               }else{
                   i++;
               }
           }
        System.out.println(Arrays.toString(arr));
       }


    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
