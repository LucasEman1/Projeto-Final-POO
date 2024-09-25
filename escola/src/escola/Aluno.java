package escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Usuario {
    private String nomeDaMae;
    private String nomeDoPai;
    private boolean atendimentoEspecial;

    // aqui é preciso hierarquia da classe usuario para receber o nome e informações
    // do aluno e usar no construtor
    public Aluno(String nome, String senha, int cpf, String telefone, String cidade, String bairro, String rua,
            int numero, String dataDeNascimento, String nomeDaMae, String nomeDoPai, boolean atendimentoEspecial) {
        super(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento);
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
    public Aluno criarAluno(Scanner sc, Aluno novo) {
        System.out.println("Digite informações de aluno: ");
        System.out.print("Nome: ");
        String nome = pediNovaInfo(sc, "nome");

        System.out.print("Senha: ");
        String senha = pediNovaInfo(sc, "senha");

        System.out.print("CPF: ");
        int cpf = pediNovaInfo(sc, "cpf");

        System.out.print("Telefone: ");
        String telefone = pediNovaInfo(sc, "telefone");

        System.out.print("cidade: ");
        String cidade = pediNovaInfo(sc, "cidade");

        System.out.print("bairro: ");
        String bairro = pediNovaInfo(sc, "bairro");

        System.out.print("rua: ");
        String rua = pediNovaInfo(sc, "rua");

        System.out.print("numero: ");
        int numero = pediNovaInfo(sc, "numero");

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = pediNovaInfo(sc, "dataDeNascimento");

        System.out.print("Nome da mãe: ");
        String nomeDaMae = pediNovaInfo(sc, "nome");

        System.out.print("Nome do pai: ");
        String nomeDoPai = pediNovaInfo(sc, "nome");

        boolean atendimentoEspecial;
        String resposta;
        while (true) {
            try {
                System.out.print("atendimento especial? ");
                resposta = sc.nextLine().toLowerCase();

                if (resposta.equals("sim")) {
                    atendimentoEspecial = true;
                    break;
                } else if (resposta.equals("nao") || resposta.equals("não")) {
                    atendimentoEspecial = false;
                    break;
                } else {
                    System.out.println("Resposta invalida. Tente novamente");
                }
            } catch (Exception n) {
                System.out.println("ERRO!\n" + n.getMessage() + "\nTente novamente");
            }
        }
        novo = new Aluno(nome, senha, Integer.parseInt(cpf), telefone, cidade, bairro, rua, Integer.parseInt(numero),
                dataDeNascimento, nomeDaMae,
                nomeDoPai, atendimentoEspecial);
        return novo;
    }

    public void editaAluno(ArrayList<Usuario> alunos, Scanner sc) {
        System.out.println("Editar informações do alunos:");
        Aluno novo = acharUsuario(alunos, sc);
        boolean ficar = true;
        String novaInfo;

        if (novo != null) {
            ficar = true;
            while (ficar) {
                try {
                    System.out.println("Qual informação editar?");
                    String opcaoEd = sc.nextLine().toLowerCase();
                    if (opcaoEd.equals("nome do pai") || opcaoEd.equals("nome do mãe")) {

                        System.out.println("Nova informação:");
                        novaInfo = pediNovaInfo(sc, "nome");

                        switch (opcaoEd) {
                            case "nome do pai":
                                novo.setNomeDaPai(novaInfo);
                                break;
                            case "nome do mãe":
                                novo.setNomeDaMae(novaInfo);
                                break;
                        }
                        ficar = false;
                    } else if (opcaoEd.equals("atentimento especial")) {
                        System.out.println("Atendimento Especial?");
                        opcaoEd = sc.nextLine().toLowerCase();
                        if (opcaoEd.equals("sim")) {
                            novo.setAtendimentoEspecial(true);
                        } else if (opcaoEd.equals("nao") || opcaoEd.equals("não")) {
                            novo.setAtendimentoEspecial(false);
                        }
                    } else if (pcaoEd.equals("nome") || opcaoEd.equals("senha") || opcaoEd.equals("cpf")
                            || opcaoEd.equals("telefone") || opcaoEd.equals("cidade") || opcaoEd.equals("bairro")
                            || opcaoEd.equals("numero") || opcaoEd.equals("data de nascimento")) {
                        novo.editarUsuario(alunos, sc);
                    } else {
                        System.out.println("Opção inválida, tente novamente.");
                    }
                } catch (Exception n) {
                    System.out.println("ERRO!" + n.getMessage());
                }
            }
        }
    }

    public void excluirAluno(ArrayList<Usuario> alunos, Scanner sc) {
        acharUsuario(alunos, sc);
        excluirUsuario(alunos, sc);
    }

    public void visualizarAluno(ArrayList<Usuario> alunos, Scanner sc) {
        visualizarUsuario(alunos, sc);
    }

    public void listarAlunos(ArrayList<Usuario> alunos, Scanner sc) {
        listarUsuarios(alunos);
    }

}
