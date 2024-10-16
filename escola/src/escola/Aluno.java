package escola;

import java.util.ArrayList;
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

    public void editaAluno() {

    }

    public void excluirAluno() {

    }

    public void visualizarAluno() {

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