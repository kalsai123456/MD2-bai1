import java.util.Scanner;

public class tiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap tien: ");
        usd = scanner.nextDouble();
        double quidoi = usd * 23000;
        System.out.println("Gia tri VND: " + quidoi);
    }
}
