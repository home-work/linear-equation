import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        //Nhập vào hệ số của phương trình
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tGIẢI PHƯƠNG TRÌNH BẬC NHẤT  ax + b = 0");
        System.out.println("Nhập vào hệ số a: ");
        a = scanner.nextFloat();
        System.out.println("Nhập vào hệ số b: ");
        b = scanner.nextFloat();

        //Giải phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm là: x = " + (0 - b) / a);
        }
    }
}
