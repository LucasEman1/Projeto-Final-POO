package escola;

import java.util.Date;

public class AgendamentoDaReuniao {
    private String assunto;
    private Date dataDaReuniao;

    public AgendamentoDaReuniao(String assunto, Date dataDaReuniao) {
        this.assunto = assunto;
        this.dataDaReuniao = dataDaReuniao;
    }

    // get e set
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getDataDaReuniao() {
        return dataDaReuniao;
    }

    public void setDataDaReuniao(Date dataDaReuniao) {
        this.dataDaReuniao = dataDaReuniao;
    }

    // métodos
    public void agendarReuniao() {

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
