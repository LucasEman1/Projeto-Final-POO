package escola;

public class Disciplina {
    private String nomeDaDisciplina;
    private int quantidadeVagas;
    private String horario;

    public Disciplina(String nomeDaDisciplina, int quantidadeVagas, String horario){
        this.nomeDaDisciplina = nomeDaDisciplina;
        this.quantidadeVagas = quantidadeVagas;
        this.horario = horario;
    }

    public Disciplina criarDisciplina(String nomeDaDisciplina, int quantidadeVagas, String horario){
        
        Disciplina nova = new Disciplina(nomeDaDisciplina, quantidadeVagas, horario);
        return nova;
    }
    public void editarDiciplina(){

    }
    public void removerDiciplina(){

    }  
    public void visualizarDiciplina(){

    } 
    public void listatDiciplina(){

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
   
}