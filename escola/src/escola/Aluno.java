package escola;

import java.util.Scanner;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;

    public Aluno(String nome, String senha, int cpf, String telefone, String cidade, String bairro, String rua,
            int numero, String dataDeNascimento, String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial) {
        super(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento);
        this.nomeDaMae = nomeDaMae;
        this.nomeDoPai = nomeDaMae;
        this.atendimentoEspecial = atendimentoEspecial;
    }

    public void verificarAluno(Scanner sc) {
        System.out.println("Digite qual o cpf do aluno: ");
        int verifica = sc.nextInt();

        

    }

    public Aluno criarAluno(Scanner sc, String identificacao) {
        return null;
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