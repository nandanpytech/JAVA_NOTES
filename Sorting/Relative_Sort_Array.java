package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Relative_Sort_Array {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[]arr1={2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[]arr2={2,42,38,0,43,21};
        Arrays.sort(arr1);
        int[]ans=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        int z=0;
        for (int j = 0; j < arr2.length; j++) {
            int repeated=map.get(arr2[j]);
            for (int k = 0; k < repeated; k++) {
                ans[z++]=arr2[j];
            }
        }

        for(int m=0;m<arr1.length;m++){
            boolean check=checking(arr1[m],ans);
            if(!check){
                ans[z++]=arr1[m];
            }
        }
        System.out.println( Arrays.toString(ans));

    }
    static boolean checking(int a,int[]ans){
        for(int l:ans){
            if(l==a){
                return true;
            }
        }
        return false;
    }
}
