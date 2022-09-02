package Array_And_String;

import java.util.*;

// You are given a strings, you have to find thereunto all such
// substrings which start and ends with the same character
public class SubString_StartAndEnd_with_same_car {
    static int  coun;
    public SubString_StartAndEnd_with_same_car(int n, String str) {
        char[] arry = str.toCharArray();
        for(int i=0; i<n; i++){
            Method(i,n,arry);
        }
    }
    void Method(int a, int n,char[] arry){
        String s = "";
        for(int i=a; i<n; i++){
            s+=arry[i];
            char[] arr = s.toCharArray();
            if(arr[0] == arr[arr.length - 1]){
                coun++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of String");
        int n = scanner.nextInt();

        System.out.println("enter the string");
        String str = scanner.next();

        SubString_StartAndEnd_with_same_car obj = new SubString_StartAndEnd_with_same_car(n,str);
        System.out.println(coun);
    }
}
