package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array A:");
        int m = sc.nextInt();
        System.out.println("Enter the size of array B (should be less than or equal to A):");
        int n = sc.nextInt();
        int A[] = new int[m];
        int B[] = new int[n];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        boolean isSubset = isSubset(A, B);
        if (isSubset) {
            System.out.println("True:Array B is a subset of array A.");
        } else {
            System.out.println("False:Array B is not a subset of array A.");
        }
    }

    private static boolean isSubset(int A[], int B[]) {
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        }
        return j == B.length;
    }
}
