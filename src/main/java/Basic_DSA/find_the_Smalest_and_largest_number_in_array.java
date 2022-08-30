package Basic_DSA;

import java.util.Scanner;

public class find_the_Smalest_and_largest_number_in_array {
    int min;
    int max;
    public find_the_Smalest_and_largest_number_in_array(int n, int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i=1; i<n; i++){
           this.min = Math.min(arr[i],min);
           this.max = Math.max(arr[i],max);
        }
    }

    @Override
    public String toString() {
        return
                "min number is=" + min +
                ", max number is=" + max;
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
        find_the_Smalest_and_largest_number_in_array  obj = new find_the_Smalest_and_largest_number_in_array(n,arr);
        System.out.println(obj.toString());
    }
}
