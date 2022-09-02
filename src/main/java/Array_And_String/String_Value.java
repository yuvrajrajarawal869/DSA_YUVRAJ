package Array_And_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Value {
        static int sum =0;
        public String_Value(String str) {
            char[] chr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            char[] array = str.toCharArray();
            for(int i=0; i<array.length; i++){
                for(int j=0; j<chr.length; j++){
                    if(array[i]==chr[j]){
                        sum+=j+1;
                    }
                }
            }
        }

        public static void main(String[] args)throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            String_Value main = new String_Value(str);
            System.out.println(sum);
        }
    }
