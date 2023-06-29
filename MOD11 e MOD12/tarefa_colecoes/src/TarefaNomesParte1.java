import java.util.*;

public class TarefaNomesParte1 {
    public static void main(String[] args) {
        listaNomes();
    }

    private static void listaNomes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes separados por vírgula: ");

        String nomes = sc.next();
        String[] vtrNomes = nomes.split(",");

        int i, j;
        String aux;

        for (i = 0; i < vtrNomes.length; i++) {
            for (j = 0; j < vtrNomes.length - i - 1; j++) {
                if (vtrNomes[j + 1].compareTo(vtrNomes[j]) > 0) {
                    aux = vtrNomes[j];
                    vtrNomes[j] = vtrNomes[j + 1];
                    vtrNomes[j + 1] = aux;
                }
            }
            System.out.println(vtrNomes[j]);
        }
    }
}