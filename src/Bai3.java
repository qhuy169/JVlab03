import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int ucln = findUCLN(a, b);
        int bcnn = findBCNN(a, b, ucln);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + bcnn);
    }

    public static int findUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findBCNN(int a, int b, int ucln) {
        return (a * b) / ucln;
    }
}
