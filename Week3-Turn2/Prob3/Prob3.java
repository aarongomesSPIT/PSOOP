
/**
 * Write a description of class Prob3 here.
 *
 * @brief Program to merge to sorted arrays into one sorted array
 * @author Aaron Gomes
 * @version 13/02/26
 */

import java.util.Scanner;
public class Prob3
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Aaron Gomes 2025300073");
        System.out.println("Enter size of array A: ");
        int A[] = new int[sc.nextInt()];
        System.out.println("Enter elements of A in ascending order: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter size of array B: ");
        int B[] = new int[sc.nextInt()];
        System.out.println("Enter elements of B in ascending order: ");
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        
        int C[] = new int[A.length + B.length];
        
        System.out.println("\nMerged array C:");
        for(int i = 0; i < C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}