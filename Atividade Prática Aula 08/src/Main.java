public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        GerenciadorDePessoa gerente = new GerenciadorDePessoa(p1, p2);
        gerente.cadastrarPessoa1(p1);
        gerente.cadastrarPessoa2(p2);
        gerente.exibirPessoa1();
        gerente.exibirPessoa2();
        gerente.atualizarPessoa1(p1);
        gerente.atualizarPessoa2(p2);
        gerente.exibirPessoa1();
        gerente.exibirPessoa2();
    }
}
