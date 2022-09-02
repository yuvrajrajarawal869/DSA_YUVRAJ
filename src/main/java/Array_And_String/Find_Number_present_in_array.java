package Array_And_String;

//You are given an array of N integers. You need to printYesif 42 is present in array, else printNo.

import java.util.Scanner;

public class Find_Number_present_in_array {
    public Find_Number_present_in_array(int n,int Num,int[] arr) {
        for (int i=0; i<n; i++){
            if(arr[i]==Num){
                System.out.println(Num+" NUmber is present in the array");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scanner.nextInt();

        System.out.println("enter the number that you want to find");
        int Num = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter number to add in array");

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        Find_Number_present_in_array obj = new Find_Number_present_in_array(n,Num,arr);
    }
}
