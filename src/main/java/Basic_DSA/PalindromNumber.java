package Basic_DSA;

public class PalindromNumber {
    public static void main(String[] args) {
        String Numbers = "12221";
        char[] s = Numbers.toCharArray();
        int left =0;
        int count =0;
        double Num = Math.floor(Numbers.length()/2);
        System.out.println(Num);
        int right =Numbers.length()-1;
        while (left<right){
            if(s[left]==s[right]){
                left++;
                right--;
                count++;
            }
            else{
                System.out.println(" string is Not palindrome");
                break;
            }
        }
        if(count==Num) System.out.println("yes");
    }
}
