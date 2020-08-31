import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");
        Scanner scanner = new Scanner(System.in);
        int N,K,result;
        N=scanner.nextInt();
        K=scanner.nextInt();

        System.out.println(result = (getFactorial(N))/(getFactorial(K)*getFactorial(N-K)));
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
