package Basic_DSA;

public class PalindromString {
    String Palindrom(String x){
        char[] s = x.toCharArray();
        int left =0;
        int right =x.length()-1;
        while (left<right)
        {
            if(s[left]==s[right]){
                left++;
                right--;
            }
            else{
                return " string is Not palindrome";
            }
        }
        return "string is  palindrome";
    }
    public static void main(String[] args) {
        PalindromString object1 = new PalindromString();
        String x = object1.Palindrom("1222134");
        System.out.println(x);
    }
}
