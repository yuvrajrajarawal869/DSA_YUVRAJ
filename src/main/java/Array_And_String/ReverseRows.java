package Array_And_String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ReverseRows {
        public ReverseRows(int[] arr) {
            String s = "";
            for(int i=arr.length-1; i>=0; i--){
                s=s+arr[i]+" ";
            }
            System.out.println(s);
        }



        public static void main(String[] args)throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(bf.readLine());
            for(int i=0; i<tc; i++){
                int[] arr = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
                ReverseRows m = new ReverseRows(arr);
            }
        }
    }
