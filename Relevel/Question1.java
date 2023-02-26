package Relevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String t=src.next();
        int T= Integer.valueOf(t);
        int n,Anne,Emme;
        while(T>0) {
            String first=src.next();
            String second=src.next();
            String third=src.next();
            n=Integer.valueOf(first);
             Anne=Integer.valueOf(second);
            Emme=Integer.valueOf(third);

            int[] arr=new  int[n];
            int count=1;
            for (int i = 0; i < n; i++) {
                arr[i]=count;
                count++;
            }
            List<List<Integer>> ans=guessTheSubsequence(arr,Anne,Emme);
            ans.remove(0);
            List<List<Integer>> anne=new ArrayList<>();

            List<List<Integer>> res=new ArrayList<>();
            for (List<Integer> list:ans){
                if(list.size()!=Anne){
                    anne.add(list);
                }
            }
            for (List<Integer> b:anne){
                if(b.size()!=Emme){
                    res.add(b);
                }
            }
            int totalans=0;
            for (List<Integer> answer:res){
                totalans+=1;
            }
            System.out.println(totalans);
            T--;
        }



    }
    static List<List<Integer>> guessTheSubsequence(int[]arr, int Anne, int Emme){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int nums: arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
