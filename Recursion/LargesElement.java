package Recursion;

public class LargesElement {
    public static void main(String[] args) {
        int[]arr={1,7,8,5,9};
        System.out.println(largestone(5,arr));
    }
    static int largestone(int n, int[]arr){
        if(n==0){
            return arr[0];
        }

        return Math.max(arr[n-1],largestone(n-1,arr));
    }
}
