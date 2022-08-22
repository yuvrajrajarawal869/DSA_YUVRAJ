package Basic_DSA;

public class PrimNumber {
    public static void main(String[] args) {
        int n=15;
        int count=0;
        for(int i=1; i<=13; i++){
            if(n%i==0) count++;
        }
        if(count==2) System.out.println("yes");
        else System.out.println("NO");
    }
}
