package Basic_DSA;
// find the factorial Number
public class FactorialOf_Number {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        if(n>=1){
            for(int i=1; i<=n; i++){
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }
}
