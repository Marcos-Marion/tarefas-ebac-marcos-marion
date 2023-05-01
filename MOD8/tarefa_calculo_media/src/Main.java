import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 valores: ");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        double mediaFinal = (num1 + num2 + num3 + num4) / 4;

        System.out.println("A média final é: " + mediaFinal);
    }
}