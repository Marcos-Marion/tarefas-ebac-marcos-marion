import java.util.*;

public class TarefasNomesParte2 {

    public static void main(String[] args) {
        listaNomesGeneros();
    }

    private static void listaNomesGeneros() {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> gruposGenero = new HashMap<>();
        gruposGenero.put("Masculino", new ArrayList<>());
        gruposGenero.put("Feminino", new ArrayList<>());
        gruposGenero.put("Outros", new ArrayList<>());

        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                break;
            }

            System.out.print("Digite o gênero (Masculino, Feminino, Outro): ");
            String genero = sc.nextLine();

            if(gruposGenero.containsKey(genero)){
                List<String> nomesDoGenero = gruposGenero.get(genero);
                nomesDoGenero.add(nome);
            } else {
                System.out.println("Gênero inválido. Tente novamente.");
            }
        }

        for(Map.Entry<String, List<String>> entry : gruposGenero.entrySet()) {
            String genero = entry.getKey();
            List<String> nomesDoGenero = entry.getValue();

            System.out.println("\n**** " + genero + " ****");
            for (String nome : nomesDoGenero) {
                System.out.println(nome);
            }
            System.out.println(" ");
        }
    }
}
