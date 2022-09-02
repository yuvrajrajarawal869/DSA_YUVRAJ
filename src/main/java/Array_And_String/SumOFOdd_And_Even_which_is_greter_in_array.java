package Array_And_String;
import java.util.*;
   //  You need to printOdd, if thesum of all odd numberspresent in the array is
   //  greater thansum of all the even numberspresent in the array, or else printEven.

class SumOFOdd_And_Even_which_is_greter_in_array{
    int sumOfEven;
    int sumOfOdd;
    public SumOFOdd_And_Even_which_is_greter_in_array(int n, int[] arr) {
        for (int i=0; i<n; i++){
            if(arr[i]%2==0){
                sumOfEven+=arr[i];
            }else{
                sumOfOdd += arr[i];
            }

        }
        if(sumOfEven>=sumOfOdd){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array length");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("enter Number");
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        SumOFOdd_And_Even_which_is_greter_in_array obj = new SumOFOdd_And_Even_which_is_greter_in_array(n, arr);
    }

}
