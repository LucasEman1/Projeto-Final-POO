C:\Users\Usuário\Documents\Projeto-Final-POO\escola\src\escola\Projeto-Final-POO\escola\src\escola\Instituicao.javaimport java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                System.out.println("Índice inválido!");
            }
        }

        public void excluirInstituicao(int index) {
            if (index >= 0 && index < instituicoes.size()) {
                instituicoes.remove(index);
                System.out.println("Instituição excluída com sucesso!");
            } else {
                System.out.println("Índice inválido!");
            }
        }

        public void listarInstituicoes() {
            for (int i = 0; i < instituicoes.size(); i++) {
                System.out.println("Instituição " + (i + 1) + ":");
                instituicoes.get(i).exibirInformacoes();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorInstituicoes gerenciador = new GerenciadorInstituicoes();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Criar Instituição");
            System.out.println("2. Editar Instituição");
            System.out.println("3. Excluir Instituição");
            System.out.println("4. Listar Instituições");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome da Instituição: ");
                    String nome = scanner.nextLine();
                    System.out.print("Endereço da Instituição: ");
                    String endereco = scanner.nextLine();
                    gerenciador.criarInstituicao(nome, endereco);
                    break;
                case 2:
                    System.out.print("Índice da Instituição a ser editada: ");
                    int indiceEditar = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Novo nome da Instituição: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo endereço da Instituição: ");
                    String novoEndereco = scanner.nextLine();
                    gerenciador.editarInstituicao(indiceEditar, novoNome, novoEndereco);
                    break;
                case 3:
                    System.out.print("Índice da Instituição a ser excluída: ");
                    int indiceExcluir = scanner.nextInt();
                    gerenciador.excluirInstituicao(indiceExcluir);
                    break;
                case 4:
                    gerenciador.listarInstituicoes();
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
