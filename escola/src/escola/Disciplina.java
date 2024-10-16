package escola;

import java.util.Scanner;

public class Disciplina {
    private String nomeDaDisciplina;
    private int quantidadeVagas;
    private String horario;

    private Disciplina(String nomeDaDisciplina, int quantidadeVagas, String horario) {
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.quantidadeVagas = quantidadeVagas;
        this.horario = horario;
    }

    public Disciplina criarDisciplina(Scanner leitor) {
        System.out.println("Nome da disciplina:");
        String nomeDaDisciplina = leitor.nextLine();
        System.out.println("Vagas da disciplina:");
        int quantidadeVagas = leitor.nextInt();
        System.out.println("Horario da disciplina:");
        String horario = leitor.nextLine();
        Disciplina nova = new Disciplina(nomeDaDisciplina, quantidadeVagas, horario);
        return nova;
    }

    public Disciplina editarDiciplina(Disciplina disciplina, Scanner leitor) {
        return disciplina = criarDisciplina(leitor);
    }

    public void removerDiciplina() {

    }

    public void visualizarDiciplina() {

    }

    public void listatDiciplina() {

    }

    public String getHorario() {
        return horario;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public int getQuantidadeVagas() {
        return quantidadeVagas;
    }

    public void setNomeDaDisciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setQuantidadeVagas(int quantidadeVagas) {
        this.quantidadeVagas = quantidadeVagas;
    }

}