package escola;

import java.util.Scanner;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;
    
    // aqui é preciso hierarquia da classe usuario para receber o nome e informações
    // do aluno e usar no construtor
    public Aluno(String nome, String senha, int cpf, String telefone, String cidade, String bairro, String rua,
            int numero, String dataDeNascimento, String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial) {
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

    public Aluno criarAluno(Scanner sc, Aluno novo) {
        System.out.println("Digite informações de aluno: ");
        System.out.print("Nome: ");
        String nome = pediNovaInfo(sc, "nome");

        System.out.print("Senha: ");
        String senha = pediNovaInfo(sc, "senha");

        System.out.print("CPF: ");
        int cpf = pediNovaInfo(sc, "cpf");

        System.out.print("Telefone: ");
        String telefone = pediNovaInfo(sc, "telefone");

        System.out.print("cidade: ");
        String cidade = pediNovaInfo(sc, "cidade");

        System.out.print("bairro: ");
        String bairro = pediNovaInfo(sc, "bairro");

        System.out.print("rua: ");
        String rua = pediNovaInfo(sc, "rua");

        System.out.print("numero: ");
        int numero = pediNovaInfo(sc, "numero");

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = pediNovaInfo(sc, "dataDeNascimento");

        System.out.print("Nome da mãe: ");
        String nomeDaMae = pediNovaInfo(sc, "nome");

        System.out.print("Nome do pai: ");
        String nomeDoPai = pediNovaInfo(sc, "nome");

        boolean atendimentoEspecial;
        String resposta;
        while (true) {
            try {
                System.out.print("atendimento especial? ");
                resposta = sc.nextLine().toLowerCase();

                if (resposta.equals("sim")) {
                    atendimentoEspecial = true;
                    break;
                } else if (resposta.equals("nao") || resposta.equals("não")) {
                    atendimentoEspecial = false;
                    break;
                } else {
                    System.out.println("Resposta invalida. Tente novamente");
                }
            } catch (Exception n) {
                System.out.println("ERRO!\n" + n.getMessage() + "\nTente novamente");
            }
        }
        novo = new Aluno(nome, senha, Integer.parseInt(cpf), telefone, cidade, bairro, rua, Integer.parseInt(numero),
                dataDeNascimento, nomeDaMae,
                nomeDoPai, atendimentoEspecial);
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
