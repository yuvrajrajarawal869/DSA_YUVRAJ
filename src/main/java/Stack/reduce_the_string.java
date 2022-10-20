package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class reduce_the_string {
        static class  stack {
            int top=-1;
            ArrayList<Character> items = new ArrayList<Character>();
            void push(char x){
                items.add(x);
                top++;
            }
            void pop(){
                // char element = items.get(top);
                items.remove(top);
                top--;
                //return element;
            }
            int length(){
                return items.size();
            }
            char topElem(){
                return items.get(top);
            }
        }

        public reduce_the_string(String str) {
            stack s = new stack();
            char[] strChar = str.toCharArray();
            for (int i = 0; i < strChar.length; i++) {
                if (s.length() != 0 && s.topElem() == strChar[i]) {
                    s.pop();
                } else {
                    s.push(strChar[i]);
                }
            }
            if (s.length() == 0) {
                System.out.println("Empty String");
            } else {
                String ff = "";
                Iterator iterator = s.items.iterator();
                while (iterator.hasNext()) {
                    ff += iterator.next();
                }
                System.out.println(ff);
            }
        }
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            new reduce_the_string(str);
        }
    }