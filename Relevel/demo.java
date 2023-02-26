package Relevel;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            System.out.println("The sum of the array is already even.");
        } else {
            boolean removed = false;
            for (int i = 0; i < n; i++) {
                if ((arr[i] % 2 == 1 && (sum - arr[i]) % 2 == 0)) {
                    System.out.println("Removed element: " + arr[i]);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("It is not possible to remove an element to make the sum even.");
            }
        }
    }
}
