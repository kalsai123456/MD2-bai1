import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner ptbn = new Scanner(System.in);
        System.out.println("a: ");
        double a = ptbn.nextDouble();

        System.out.println("b: ");
        double b = ptbn.nextDouble();

        System.out.println("c: ");
        double c = ptbn.nextDouble();
        if (a != 0){
            double answer = (c - b)/a;
            System.out.println("Phuong trinh co nghiem duy nhat la: " + answer);
        } else {
            if (b == c){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
