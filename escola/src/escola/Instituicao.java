import java.util.ArrayList;
import java.util.List;

public class Instituicao {
    private String nome;
    private String endereco;

    public Instituicao(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Instituição: " + nome);
        System.out.println("Endereço: " + endereco);
    }

    public static class GerenciadorInstituicoes {
        private List<Instituicao> instituicoes = new ArrayList<>();

        public void criarInstituicao(String nome, String endereco) {
            Instituicao novaInstituicao = new Instituicao(nome, endereco);
            instituicoes.add(novaInstituicao);
            System.out.println("Instituição criada com sucesso!");
        }

        public void editarInstituicao(int index, String novoNome, String novoEndereco) {
            if (index >= 0 && index < instituicoes.size()) {
                Instituicao instituicao = instituicoes.get(index);
                instituicao.setNome(novoNome);
                instituicao.setEndereco(novoEndereco);
                System.out.println("Instituição editada com sucesso!");
            } else {
                System.out.println("indice inválido!");
            }
        }
        public void excluirInstituicao(int index) {
            if (index >= 0 && index < instituicoes.size()) {
                instituicoes.remove(index);
                System.out.println("Instituição excluída com sucesso!");
            } else {
                System.out.println("indice inválido!");
            }
        }
        public void listarInstituicoes() {
            for (int i = 0; i < instituicoes.size(); i++) {
                System.out.println("Instituiçao" + (i + 1) + ":");
                instituicoes.get(i).exibirInformacoes();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorInstituicoes gerenciador = new GerenciadorInstituicoes();

        gerenciador.criarInstituicao("Escola ABC", "Rua das Flores, 123");
        gerenciador.criarInstituicao("Escola XYZ", "Avenida Central, 456");

        gerenciador.listarInstituicoes();

        gerenciador.editarInstituicao(0, "Escola ABCD", "Rua das Rosas, 789");

        gerenciador.excluirInstituicao(1);

        gerenciador.listarInstituicoes();
    }
}
