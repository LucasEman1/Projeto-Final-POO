package escola;

public class Matricula {
    private String nomeDaInstituicao;
    private int anoLetivo;

    public Matricula(String nomeDaInstituicao, int anoLetivo) {
        this.nomeDaInstituicao = nomeDaInstituicao;
        this.anoLetivo = anoLetivo;
    }

    // Metodos
    public void fazerMatricula() {

    }

    public void editarMatricula() {

    }

    public void removerMatricula() {

    }

    public void visualizarMatricula() {

    }

    public void listatMatricula() {

    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public String getNomeDaInstituicao() {
        return nomeDaInstituicao;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public void setNomeDaInstituicao(String nomeDaInstituicao) {
        this.nomeDaInstituicao = nomeDaInstituicao;
    }

}