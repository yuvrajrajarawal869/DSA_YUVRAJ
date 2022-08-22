package Basic_DSA;

public class MultiplicationTable {
    public static void main(String[] args) {
        int sum = 0;
        int Num=3;
        int k=5;
        for(int i=0; i<=3*10; i++){
            if(i%Num==0){
                if(i%k==0) sum+=i;
            }
        }
        System.out.println(sum);
    }
}
