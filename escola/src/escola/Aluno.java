package escola;

import java.util.Scanner;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;

    public Aluno(String nome, String senha, String cpf, String telefone, String cidade, String bairro, String rua,
            String numero, String dataDeNascimento, String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial) {
        super(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDaMae;
        this.atendimentoEspecial = atendimentoEspecial;
    }

    public void verificarAluno() {

    }

    public Aluno criarAluno(Scanner sc) {
        System.out.println("Digite informações de aluno: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("cidade: ");
        String cidade = sc.nextLine();

        System.out.print("bairro: ");
        String bairro = sc.nextLine();

        System.out.print("rua: ");
        String rua = sc.nextLine();

        System.out.print("numero: ");
        String numero = sc.nextLine();

        sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = sc.nextLine();

        System.out.print("Nome da mãe: ");
        String nomeDaMae = sc.nextLine();

        System.out.print("Nome do pai: ");
        String nomeDoPai = sc.nextLine();

        System.out.print("atendimento especial? ");
        boolean atendimentoEspecial = true;

        Aluno novo = new Aluno(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento, nomeDaMae,
                nomeDoPai, atendimentoEspecial);
        return novo;
    }

    public void editaAluno(Scanner sc) {
        String opcao = "0";

        while (opcao != "0") {
            System.out.println(toString());
            System.out.println("qual opcao editar: ");
            System.out.println("opcoes: nome, senha, cpf, telefone, endereco, idade, mae, pai");
            opcao = sc.nextLine();
            switch (opcao) {
                case "nome":
                System.out.print("Nome: ");
                setNome(sc.nextLine());
                    break;
                case "senha":
                System.out.print("Senha: ");
                setSenha(sc.nextLine());
                    break;
                case "cpf":
                System.out.print("CPF: ");
                setCpf(sc.nextLine());
                    break;
                case "telefone":
                System.out.print("telefone: ");
                setTelefone(sc.nextLine());
                    break;
                case "endereco":
                System.out.print("Cidade: ");
                setCidade(sc.nextLine());
                System.out.print("Bairro: ");
                setBairro(sc.nextLine());
                System.out.print("Rua: ");
                setRua(sc.nextLine());
                System.out.print("Número: ");
                setNumero(sc.nextLine());
                    break;
                case "idade":
                System.out.print("data de nascimento: ");
                setDataDeNascimento(sc.nextLine());
                    break;
                case "mae":
                System.out.print("Nome da Mae: ");
                setNomeDaMae(sc.nextLine());
                    break;
                case "pai":
                System.out.print("Nome do pai: ");
                setNomeDoPai(sc.nextLine());
                    break;
                default:
                    break;
            }
        }
    }

    public void excluirAluno() {
        
    }

    public void visualizarAluno() {
        System.out.println(toString());
    }

    public void listarAlunos() {
        
    }

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
}