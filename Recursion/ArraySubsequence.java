package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsequence {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        List<Integer> a=new ArrayList<>();
        subsequence(arr,0,a);
    }
    static void subsequence(int[]arr,int index,List<Integer>a){
        if(arr.length<=index){
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i)+"");
            }
            System.out.println();
            return;
        }
        a.add(arr[index]);
        subsequence(arr,index+1,a);
        a.remove(a.size()-1);
        subsequence(arr,index+1,a);
    }
}
