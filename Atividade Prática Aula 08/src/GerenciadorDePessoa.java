import java.util.Scanner;
public class GerenciadorDePessoa {
    Scanner scanner = new Scanner(System.in);
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    public GerenciadorDePessoa(Pessoa pessoa1, Pessoa pessoa2){
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
    }
    public void cadastrarPessoa1(Pessoa pessoa){
        System.out.println("====================== DADOS DA PESSOA 1 ======================");
        System.out.println("Vamos cadastrar a primeira pessoa");
        System.out.print("Informe o NOME da Pessoa 1: ");
        this.pessoa1.setNome(scanner.next());
        System.out.print("\nInforme o CPF de " + pessoa1.getNome() + " : ");
        this.pessoa1.setCpf(scanner.next());
        System.out.print("\nInforme a idade de " + pessoa1.getNome() + " : ");
        this.pessoa1.setIdade(scanner.nextInt());
        System.out.println("======================      FIM        ======================");       
    }
    public void cadastrarPessoa2(Pessoa pessoa){
        System.out.println("====================== DADOS DA PESSOA 2 ======================");
        System.out.println("Vamos cadastrar a segunda pessoa");
        System.out.print("Informe o NOME da Pessoa 2: ");
        this.pessoa2.setNome(scanner.next());
        System.out.printf("\nInforme o CPF de " + pessoa2.getNome() + " : ");
        this.pessoa2.setCpf(scanner.next());
        System.out.printf("\nInforme a idade de " + pessoa2.getNome() + " : ");
        this.pessoa2.setIdade(scanner.nextInt());
        System.out.println("======================      FIM        ======================");        
    }
    
    public void atualizarPessoa1(Pessoa pessoa){
        int op;
        System.out.println("====================== ATUALIZAÇÃO DA PESSOA 1 ======================");
        do {
            System.out.println("Você pode alterar os seguintes dados da Pessoa 1.");
            System.out.println("1 - Nome;");
            System.out.println("2 - CPF;");
            System.out.println("3 - Idade;");
            System.out.println("0 - Sair.");
            System.out.print("Escolha uma das opções acima: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Informe o novo NOME: ");
                    this.pessoa1.setNome(scanner.next());
                    break;
                case 2:
                    System.out.printf("\nInforme o CPF de " + this.pessoa1.getNome() + " : ");
                    this.pessoa1.setCpf(scanner.next());
                    break;
                case 3:
                    System.out.printf("\nInforme a idade de " + this.pessoa1.getNome() + " : ");
                    this.pessoa1.setIdade(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("======================           FIM        ======================");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    atualizarPessoa1(this.pessoa1);
                    break;
            }
        } while (op != 0);
    }

    public void atualizarPessoa2(Pessoa pessoa){
        int op;
        System.out.println("====================== ATUALIZAÇÃO DA PESSOA 2 ======================");
        do {
            System.out.println("Você pode alterar os seguintes dados da Pessoa 2.");
            System.out.println("1 - Nome;");
            System.out.println("2 - CPF;");
            System.out.println("3 - Idade;");
            System.out.println("0 - Sair.");
            System.out.print("Escolha uma das opções acima: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Informe o novo NOME: ");
                    this.pessoa2.setNome(scanner.next());
                    break;
                case 2:
                    System.out.printf("\nInforme o novo CPF de " + this.pessoa2.getNome() + " : ");
                    this.pessoa2.setCpf(scanner.next());
                    break;
                case 3:
                    System.out.printf("\nInforme a nova idade de " + this.pessoa2.getNome() + " : ");
                    this.pessoa2.setIdade(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("======================           FIM        ======================");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    atualizarPessoa1(this.pessoa2);
                    break;
            }
        } while (op != 0);
    }
    
    public void exibirPessoa1(){
        System.out.println("====================== DADOS DA PESSOA 1 ======================");
        System.out.println("Nome: " + this.pessoa1.getNome());
        System.out.println("CPF: " + this.pessoa1.getCpf());
        System.out.println("Idade: " + this.pessoa1.getIdade());
        System.out.println("======================      FIM        ======================");
    }
    
    public void exibirPessoa2(){
        System.out.println("====================== DADOS DA PESSOA 2 ======================");
        System.out.println("Nome: " + this.pessoa2.getNome());
        System.out.println("CPF: " + this.pessoa2.getCpf());
        System.out.println("Idade: " + this.pessoa2.getIdade());
        System.out.println("======================      FIM        ======================");
    }
}
