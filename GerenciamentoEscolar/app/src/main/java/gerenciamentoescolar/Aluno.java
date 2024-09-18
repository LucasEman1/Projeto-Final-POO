package gerenciamentoescolar;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;

    // aqui é preciso hierarquia da classe usuario para receber o nome e informações
    // do aluno e usar no construtor
    public Aluno(String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial) {
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
    public void verificarAluno() {

    }

    public void criarAluno() {

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
