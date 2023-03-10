package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int target=4;
        List<List<Integer>> res=subset(arr,target);
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println(" ");
//        }


    }
    static List<List<Integer>> subset(int[]arr,int target){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if(summ(internal)==target){
                    for (int j = 0; j < internal.size(); j++) {
                        System.out.print(internal.get(j));
                    }
                    System.out.println(" ");
                }
                outer.add(internal);
            }
        }
        return outer;
    }
    static  int summ(List<Integer> arr){
        int total=0;
        for (int i = 0; i < arr.size(); i++) {
            total+=arr.get(i);
        }
        return total;
    }
}
