public class Programa {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Marcos");
        pessoaFisica.setIdade(22);
        pessoaFisica.setCpf("1234");
        imprimir(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Vinicius");
        pessoaJuridica.setIdade(22);
        pessoaJuridica.setCnpj("1234 789");
        imprimir(pessoaJuridica);
    }
    public static void imprimir(Pessoa pessoa){
        if(pessoa instanceof PessoaJuridica){
            PessoaJuridica pj = (PessoaJuridica) pessoa;
            System.out.println("\nNome: " + pessoa.getNome() +"\nIdade: "+ pj.getIdade() +"\nPortador do CNPJ: " + pessoa.identificacao());
        } else {
            System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nPortador do CPF: " + pessoa.identificacao());
        }
    }
}
