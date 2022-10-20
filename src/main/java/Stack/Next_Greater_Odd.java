package Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Next_Greater_Odd {
    class stack {
        int top = -1;
        int items[];

        void push(int x) {
            if (top == items.length - 1) {
                System.out.println("Stack full");
            } else {
                items[++top] = x;
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Underflow error");
                return -1;
            } else {
                int element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() {
            return (top == -1) ? true : false;
        }

        int length() {
            return top + 1;
        }

        int topElem() {
            return items[top];
        }

        void setK(Object v) {
            items = (int[]) v;
        }
    }

    public Next_Greater_Odd(int arr[], int n) {
        int[] ans = new int[n];
        stack s = new stack();
        s.setK(new int[n]);
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (s.length() != 0 && s.topElem() <= arr[i]) {
                s.pop();
            }
            if (s.length() == 0) {
                ans[i] = -1;
            } else {
                if (s.topElem() % 2 != 0) {
                    sum += arr[i];
                }
                ans[i] = s.topElem();
            }
            s.push(arr[i]);
        }
        System.out.println(sum);
    }

    // Driver Code
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(bf.readLine());
        for (int i = 0; i < p; i++) {
            int s = Integer.parseInt(bf.readLine());
            int[] arr = Stream.of(bf.readLine().trim().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            Next_Greater_Odd main = new Next_Greater_Odd(arr, s);
        }
    }
}

