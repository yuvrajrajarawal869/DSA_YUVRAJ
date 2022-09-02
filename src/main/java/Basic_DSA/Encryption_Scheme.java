package Basic_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.*;

public class Encryption_Scheme {
    int sum;
    public Encryption_Scheme(int n, int[] arr) {
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                sum+=i+1;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args)throws IOException{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            int[] arr  = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
            Encryption_Scheme main = new Encryption_Scheme(n,arr);
        }
    }

