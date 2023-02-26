package Sorting;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] A={2,1,2};
        Arrays.sort(A);
        for (int i = A.length - 3; i >= 0; --i)
            if (A[i] + A[i+1] > A[i+2]) {                        //Important condition: a+b>c
                System.out.println( A[i] + A[i + 1] + A[i + 2]);
            }
        System.out.println(0);
    }
}
