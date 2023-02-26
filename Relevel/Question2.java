package Relevel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        List<Integer> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sr.nextInt());
        }
        int op=tocheck(arr);
        System.out.println(op);
    }
    static int tocheck(List<Integer> arr){
        int operation=0;
        while (arr.size()!=0){
            arr.remove(0);
            for (int i = 0; i < arr.size(); i++) {
                arr.set(i,arr.get(i)/2);
            }
            if(checkEven(arr)){
                return operation;
            }else{
                operation++;
            }
        }

        return  operation;

    }

    static boolean checkEven(List<Integer> arr){
        int totalsum=0;
        for (int i = 0; i < arr.size(); i++) {
            totalsum+=arr.get(i);
        }
        if(totalsum%2==0){
            return true;
        }else{
            return false;
        }
    }
}
