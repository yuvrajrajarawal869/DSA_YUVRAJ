package Basic_DSA;

public class PrimNumber_Find {
    public static void main(String[] args) {
        int n=50;
        for(int i=1; i<=n; i++)
        {
            int flag = 0;
            for (int j = 2; j<i; j++)
            {
                if (i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (i > 1 && flag == 0) {
                System.out.println(i);
            }
        }
    }
}
