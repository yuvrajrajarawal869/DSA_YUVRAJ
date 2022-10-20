package BubbleShort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class SortOut {
    int[] arrIndex;
    void shortArray(int n,int[] arr){
        arrIndex = new int[n];
        for(int i=0; i<n; i++){
            arrIndex[i]=i;
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    int inc = arrIndex[j];
                    arrIndex[j]=arrIndex[j+1];
                    arrIndex[j+1]=inc;

                }
            }
        }
    }
    void printArray(){
        int n = this.arrIndex.length;
        for (int i = 0; i < n; ++i)
            System.out.print(this.arrIndex[i] + " ");
        System.out.println();
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        SortOut m = new SortOut();
        m.shortArray(n,arr);
        m.printArray();
    }
}

