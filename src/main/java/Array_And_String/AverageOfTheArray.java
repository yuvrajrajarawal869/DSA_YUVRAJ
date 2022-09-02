package Array_And_String;

import java.util.Scanner;

public class AverageOfTheArray {
        int sum;
        public AverageOfTheArray(int n, int[] arr) {
            for (int i=0; i<n; i++){
                sum+=arr[i];
            }
            System.out.println("Avrage is "+sum/n);
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
            AverageOfTheArray obj = new AverageOfTheArray(n, arr);
        }

}
