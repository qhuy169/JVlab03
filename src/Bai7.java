import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N > 0: ");
        int N = scanner.nextInt();

        if (N > 0) {
            printOddNumbers(N);
            System.out.println("Tổng bình phương các số lẻ < " + N + " là: " + calculateSumOfSquares(N));
            printEvenNumbersGreaterThanAverage(N);
        } else {
            System.out.println("Số nhập vào phải lớn hơn 0");
        }
    }

    public static void printOddNumbers(int N) {
        System.out.print("Các số lẻ < " + N + " là: ");
        for (int i = 1; i < N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int calculateSumOfSquares(int N) {
        int sum = 0;
        for (int i = 1; i < N; i += 2) {
            sum += i * i;
        }
        return sum;
    }

    public static void printEvenNumbersGreaterThanAverage(int N) {
        double average = N / 2.0;
        System.out.print("Các số chẵn > trung bình cộng của " + N + " số nguyên dương từ 1 tới " + N + " là: ");
        for (int i = 2; i <= N; i += 2) {
            if (i > average) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
