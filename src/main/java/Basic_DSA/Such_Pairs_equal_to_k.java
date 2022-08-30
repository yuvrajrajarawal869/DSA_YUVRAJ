package Basic_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Such_Pairs_equal_to_k{
   static int count = 0;
    public Such_Pairs_equal_to_k(int n, int k, int[] arr) {
        for (int i = 0; i < n; i++) {
            Method(i, k, arr, n);
        }
    }

    void Method(int i, int k, int[] arr, int n) {
        for (int j = i; j < n; j++) {
            if (arr[i] + arr[j] == k) {
                count++;
            }
        }
    }
        public static void main(String[] args)throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int[] arr1 = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
            int[] arr2 = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
            Such_Pairs_equal_to_k  m = new Such_Pairs_equal_to_k (arr1[0],arr1[1],arr2);
            System.out.println(count);
        }
    }
