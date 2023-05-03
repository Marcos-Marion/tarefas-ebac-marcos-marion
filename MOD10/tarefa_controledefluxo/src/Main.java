import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a média de 4 notas!");

        System.out.print("Digite a primeira nota: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double num3 = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double num4 = sc.nextDouble();

        double mediaFinal = (num1 + num2 + num3 + num4) / 4;
        if(mediaFinal >= 7){
            System.out.println("A média final é: " + mediaFinal + " você foi aprovado.");
        } else if(mediaFinal >= 5){
            System.out.println("A média final é: " + mediaFinal + " você está de recuperação.");
        } else{
            System.out.println("A média final é: " + mediaFinal + " você foi reprovado.");
        }

    }
}