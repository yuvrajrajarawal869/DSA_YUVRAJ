package Basic_DSA;

public class OddNumberSum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<5; i++){
            if(i%2==0) sum+=i;
        }
        System.out.println(sum);
    }
}
