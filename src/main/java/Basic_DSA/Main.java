package Basic_DSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
        Main(int n, String str){
            Set<String> result = new HashSet<String>();

            for (int i = 0; i <= str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {

                    result.add(str.substring(i, j));
                }
            }
            System.out.println(result.size());
        }

        public static void main(String[] arg) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(bf.readLine());
            for(int i=0; i<tc; i++){
                int n = Integer.parseInt(bf.readLine());
                String str = bf.readLine();
                Basic_DSA.Main sc = new Basic_DSA.Main(n,str);


            }

        }
    }

