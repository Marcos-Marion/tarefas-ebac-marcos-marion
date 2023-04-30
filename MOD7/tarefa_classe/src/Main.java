/**
 * @author Marcos Marion
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrimeiraNota primeiraNota = new PrimeiraNota();
        SegundaNota segundaNota = new SegundaNota();

        System.out.println("Vamos calcular a média!\n");

        System.out.print("Digite a primeira nota: ");
        primeiraNota.setNota1(sc.nextFloat());
        System.out.println("A primeira nota é: " + primeiraNota.getNota1() + "\n");

        System.out.print("Digite a segunda nota: ");
        segundaNota.setNota2(sc.nextFloat());
        System.out.println("A segunda nota é: " + segundaNota.getNota2() + "\n");

        float mediaFinal = (primeiraNota.getNota1() + segundaNota.getNota2()) / 2;

        System.out.println(mediaFinal);


    }
}