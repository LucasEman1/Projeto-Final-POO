package escola;
import java.util.Scanner;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;

    // aqui é preciso hierarquia da classe usuario para receber o nome e informações
    // do aluno e usar no construtor
    public Aluno(String nome, String senha, int cpf, String telefone, String cidade, String bairro, String rua, int numero, String dataDeNascimento, String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial){
        super(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDaMae;
        this.atendimentoEspecial = atendimentoEspecial;
    }

    // get e set
    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public boolean isAtendimentoEspecial() {
        return atendimentoEspecial;
    }

    public void setAtendimentoEspecial(boolean atendimentoEspecial) {
        this.atendimentoEspecial = atendimentoEspecial;
    }

    // métodos
    public boolean verificarAluno() {

    }
    
    public Aluno criarAluno(Aluno novo, Scanner sc) {
        System.out.println("Digite informações de aluno: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        
        System.out.print("CPF: ");
        int cpf = sc.nextInt();
        
        sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        
        System.out.print("cidade: ");
        String cidade = sc.nextLine();
        
        System.out.print("bairro: ");
        String bairro = sc.nextLine();
        
        System.out.print("rua: ");
        String rua = sc.nextLine();
        
        System.out.print("numero: ");
        int numero = sc.nextInt();
        
        sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = sc.nextLine();

        System.out.print("Nome da mãe: ");
        String nomeDaMae = sc.nextLine();

        System.out.print("Nome do pai: ");
        String nomeDoPai = sc.nextLine();

        System.out.print("atendimento especial? ");
        boolean atendimentoEspecial = sc.nextBoolean();

        novo = new Aluno (nome,senha, cpf,telefone,cidade,bairro,rua, numero,dataDeNascimento,nomeDaMae,nomeDoPai, atendimentoEspecial);
        return novo;
    }

    public void editaAluno() {

    }

    public void excluirAluno() {

    }

    public void visualizarAluno() {

    }

    public void listarAlunos() {

    }

}
