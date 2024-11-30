import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N > 0 và < 16: ");
        int N = scanner.nextInt();

        if (N >= 0 && N <= 16) {
            int factorial = calculateFactorial(N);
            System.out.println("Giai thừa của " + N + " là: " + factorial);
        } else {
            System.out.println("Số nhập vào phải lớn hơn 0");
        }
    }

    public static int calculateFactorial(int N) {
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
