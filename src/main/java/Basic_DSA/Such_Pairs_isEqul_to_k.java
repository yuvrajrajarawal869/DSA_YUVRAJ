package Basic_DSA;

//You are given an arrayAofNintegers along with a target integerK.
//Your task is to find out the number of pairs of integers present in the array, whose sum is equal to
// the target valueK.

import java.util.Scanner;

public class Such_Pairs_isEqul_to_k {
   static int count;
    public Such_Pairs_isEqul_to_k(int n,int k, int[] arr){
        for(int i=0; i<n; i++){
            Method(i,k,arr,n);
        }
    }
    void Method(int i, int k, int[] arr,int n){
        for(int j=i; j<n; j++){
            if(arr[i]+arr[j]==k) {
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Length of array");
        int n = scanner.nextInt();

        System.out.println("enter the k");
        int k = scanner.nextInt();
        System.out.println("enter array");
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        Such_Pairs_isEqul_to_k obj = new Such_Pairs_isEqul_to_k(n,k,array);
        System.out.println(count);
    }
}
