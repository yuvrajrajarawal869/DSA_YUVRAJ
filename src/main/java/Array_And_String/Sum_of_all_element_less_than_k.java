package Array_And_String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Sum_of_all_element_less_than_k{
    static int sum = 0;
    public Sum_of_all_element_less_than_k(int n, int k, int[] arr) {
        for (int i = 0; i < n; i++) {
            if(arr[i]<=k){
                sum=sum+arr[i];
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] arr2 = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        Sum_of_all_element_less_than_k  m = new Sum_of_all_element_less_than_k(arr1[0],arr1[1],arr2);
        System.out.println(sum);
    }
}