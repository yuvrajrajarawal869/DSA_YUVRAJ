package Array_And_String;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.Arrays;

public class MatrixInput {
         public static void method(int n, int m, int[][] arr){
             for(int i=0; i<n; i++){
                 String sss ="";
                 for(int j=0; j<m; j++){
                   //  iuiiyfui= bn b

                 }
                 System.out.println(sss);
             }
         }
        public static void main(String[] arg)throws IOException{
//            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//            int[] n = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
//            int[][] mat =  new int[n[0]][n[1]];
//            for(int i=0; i<n[0]; i++){
//                int[] arr = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
//                mat[i]=arr;
//            }
            int n=3;
            int m=3;
            int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
            method(n,n,mat);
        }
}

