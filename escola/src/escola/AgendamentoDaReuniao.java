package escola;

import java.util.Scanner;

public class AgendamentoDaReuniao {
    private String assunto;
    private String dataDaReuniao;

    public AgendamentoDaReuniao(String assunto, String dataDaReuniao) {
        this.assunto = assunto;
        this.dataDaReuniao = dataDaReuniao;
    }

    /*
     * A classe “AgendamentoDeReuinao” serve para que o aluno
matriculado possa agendar reuniões com a instituição, inserindo o assunto e a data que deseja
     */

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDataDaReuniao() {
        return dataDaReuniao;
    }

    public void setDataDaReuniao(String dataDaReuniao) {
        this.dataDaReuniao = dataDaReuniao;
    }

    // métodos
    public void agendarReuniao(Scanner sc) {
        System.out.println("Criar uma reunião");
        System.out.println("Assunto da reunião: ");
        assunto = sc.nextLine();
        
        System.out.println("Data da reunião ex:11/02/2003: ");
        dataDaReuniao = sc.nextLine();
    }

    public void mostrarReuniao() {

    }

    public void removerReuniao() {

    }

    public void editarReuniao() {

    }

    public void visualizarReuniao() {

    }
}
