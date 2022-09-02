package Array_And_String;

import java.util.Scanner;

public class Number_of_Odd_element_and_Even_in_Array {
    String EvenNumber="";
    String OddNumber="";
    public Number_of_Odd_element_and_Even_in_Array( int n, int[] arr){

        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                EvenNumber+=arr[i]+" ";
            }else {
                OddNumber+=arr[i]+" ";
            }
        }
    }

    @Override
    public String toString() {
        return
                "EvenNumber='" + EvenNumber + '\'' +
                ", OddNumber='" + OddNumber + '\'' ;
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
        Number_of_Odd_element_and_Even_in_Array  obj = new Number_of_Odd_element_and_Even_in_Array(n,arr);
        System.out.println(obj.toString());
    }

}
