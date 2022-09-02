package Array_And_String;

import java.util.Scanner;

public class Max__Number_of_index_of_binary_Array {
        int count1;
        int count2;
        int max;
        int num;
    public Max__Number_of_index_of_binary_Array( int n, int[] arr){

        for (int i = 0; i < n; i++) {
             if(arr[i]==1){
                 count1++;
             }else {
                 count2++;
             }
          }
        max = Math.max(count1,count2);
        if(count1>count2){
            num=1;
        }else{
            num=0;
        }
      }

        @Override
        public String toString () {
        return
                num+" is present " +max+" time in the array";
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter number to add in array");

        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        Max__Number_of_index_of_binary_Array  obj = new Max__Number_of_index_of_binary_Array(n,arr);
        System.out.println(obj.toString());
      }
}
