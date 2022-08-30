package Basic_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class find_Average_Of_array_with_multiple_test_case {
        int sum;
        boolean method(int n, int m, int[] array) {
            int left=0;
            int right = n-1;
            while (left<n & right>=0){
                int ss = array[left]+array[right];
                if(ss == m){
                    return true;
                } else if (ss<m) {
                    left++;
                }else {
                    right++;
                }
            }
            return false;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int[] tc = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
            for(int j=0; j<tc[0]; j++){
                int[] arr = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
                int n = arr[0];
                int m = arr[1];
                int[] array= Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
                find_Average_Of_array_with_multiple_test_case  main = new find_Average_Of_array_with_multiple_test_case ();
                boolean c = main.method(n,m,array);
                System.out.println(c);
            }
        }
    };

