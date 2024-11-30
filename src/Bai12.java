import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        System.out.println("Dãy Fibonacci từ 1 đến " + n + " là:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");
        while (true) {
            int next = a + b;
            if (next > n) {
                break;
            }
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
