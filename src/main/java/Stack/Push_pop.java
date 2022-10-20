package Stack;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Push_pop {
        int n;
        int Top=-1;
        int[] stack;
        public  Push_pop(int n){
            this.n=n;
            stack=new int[n];
        }
        void push(int x){
            if(this.Top>=-1 && this.Top<this.n){
                Top++;
                stack[Top]=x;
            }
        }
        void pop(){
            if(this.Top>-1 && this.Top<this.n){
                System.out.println(stack[Top]);
                Top--;
            }else if(Top==-1){
                System.out.println("No Food");
            }
        }

        public static void main(String[] args)throws IOException{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            Push_pop main = new Push_pop(n);
            for(int i=0; i<n; i++){
                int[] tc = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
                if(tc[0]==1){
                    main.pop();
                }else {
                    main.push(tc[1]);
                }
            }
        }
    }
