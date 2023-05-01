import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");

        int valorDigitado = sc.nextInt();
        System.out.println("O valor digitado foi: " + valorDigitado);

        Integer valorDigitadoI = valorDigitado;
        System.out.println("O valor digitado foi: " + valorDigitadoI);
    }
}