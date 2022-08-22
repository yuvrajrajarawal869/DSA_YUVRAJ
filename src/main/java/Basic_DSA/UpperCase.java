package Basic_DSA;

public class UpperCase {

    public static void main(String[] args) {
        String str ="yuvraj";
        char[] s = str.toCharArray();
        String car = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] b = car.toCharArray();
        String bag="";
        for(int i=0; i<s.length; i++){
            for(int j=0; j<b.length; j++){
                if(s[i]==b[j]) bag+=b[j];
            }
        }
        System.out.println(bag);
    }

}
