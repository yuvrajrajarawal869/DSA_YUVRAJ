package Basic_DSA;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Even_Palindrome {
        String sd = "";
        public Even_Palindrome(int n, String str) {
            char[] chrArr = str.toCharArray();
            for(int i=0; i<n; i++){
                if(i%2==0){
                    sd+=chrArr[i];
                }
            }
        }
        String method(){
            char[] x = this.sd.toCharArray();
            int left =0;
            int right =x.length-1;
            while (left<right)
            {
                if(x[left]==x[right]){
                    left++;
                    right--;
                }
                else{
                    return "no";
                }
            }
            return "yes";
        }

        public static void main(String[] args)throws IOException{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            Even_Palindrome m = new Even_Palindrome(n,str);
            System.out.println(m.method());

        }
    }