package Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
public class Push_Pop_and_Top {
        int n;
        int Top=-1;
        int[] stack;
        public  Push_Pop_and_Top(int n){
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
                Top--;
            }
        }
        void  top(){
            if(this.Top==-1){
                System.out.println("Empty!");
            }else{
                System.out.println(stack[Top]);
            }
        }
        public static void main(String[] args)throws IOException{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            Push_Pop_and_Top main = new Push_Pop_and_Top(n);
            for(int i=0; i<n; i++){
                int[] tc = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
                if(tc[0]==1){
                    main.push(tc[1]);
                }else if(tc[0]==2){
                    main.pop();
                }else {
                    main.top();
                }
            }
        }
    }

