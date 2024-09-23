package gerenciamentoescolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private String senha;
    private int cpf;
    private String telefone;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String dataDeNascimento;

    public Usuario(String nome, String senha, int cpf, String telefone, String cidade, String bairro, String rua,
            int numero, String dataDeNascimento) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.dataDeNascimento = dataDeNascimento;
    }

    // métodos
    public Usuario criarUsuario(Scanner sc) {
        System.out.println("Digite informações de usuário: ");
        System.out.print("Nome: ");
        String nome = pediNovaInfo(sc, "nome");

        System.out.print("Senha: ");
        String senha = pediNovaInfo(sc, "senha");

        System.out.println("CPF: ");
        String cpf = pediNovaInfo(sc, "cpf");

        System.out.print("Telefone: ");
        String telefone = pediNovaInfo(sc, "telefone");

        System.out.print("cidade: ");
        String cidade = pediNovaInfo(sc, "cidade");

        System.out.print("bairro: ");
        String bairro = pediNovaInfo(sc, "bairro");

        System.out.print("rua: ");
        String rua = pediNovaInfo(sc, "rua");

        System.out.print("numero: ");
        String numero = pediNovaInfo(sc, "numero");

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = pediNovaInfo(sc, "dataDeNascimento");

        Usuario novo = new Usuario(nome, senha, Integer.parseInt(cpf), telefone, cidade, bairro, rua,
                Integer.parseInt(numero), dataDeNascimento);
        return novo;
    }// chama o contrudor e retorna um objeto Usuario novo

    public void editarUsuario(ArrayList<Usuario> usuarios, Scanner sc) {
        System.out.println("Editar informações do usuário:");
        Usuario novo = acharUsuario(usuarios, sc);

        if (novo != null) {
            boolean ficar = true;
            while (ficar) {
                try {
                    System.out.println("Qual informação editar?");
                    String opcaoEd = sc.nextLine().toLowerCase();
                    if (opcaoEd.equals("nome") || opcaoEd.equals("senha") || opcaoEd.equals("cpf")
                            || opcaoEd.equals("telefone") || opcaoEd.equals("cidade") || opcaoEd.equals("bairro")
                            || opcaoEd.equals("numero") || opcaoEd.equals("data de nascimento")) {

                        System.out.println("Nova informação:");
                        String novaInfo = pediNovaInfo(sc, opcaoEd);

                        switch (opcaoEd) {
                            case "nome":
                                novo.setNome(novaInfo);
                                break;
                            case "senha":
                                novo.setSenha(novaInfo);
                                break;
                            case "cpf":
                                novo.setCpf(Integer.parseInt(novaInfo));
                                break;
                            case "telefone":
                                novo.setTelefone(novaInfo);
                                break;
                            case "cidade":
                                novo.setCidade(novaInfo);
                                break;
                            case "bairro":
                                novo.setBairro(novaInfo);
                                break;
                            case "rua":
                                novo.setRua(novaInfo);
                                break;
                            case "numero":
                                novo.setNumero(Integer.parseInt(novaInfo));
                                break;
                            case "dataDeNascimento":
                                novo.setDataDeNascimento(novaInfo);
                                break;
                        }
                        ficar = false;
                    } else {
                        System.out.println("Opção inválida, tente novamente.");
                    }
                } catch (Exception n) {
                    System.out.println("ERRO!" + n.getMessage());
                }
            }
        }
    }

    public ArrayList<Usuario> excluirUsuario(ArrayList<Usuario> usuarios, Scanner sc) {
        System.out.println("Excluir usuário.");
        Usuario n = acharUsuario(usuarios, sc);
        if (n != null) {
            usuarios.remove(n);
            System.out.println("Usuário removido.");
        } else {
            System.out.println("usuario não encontrado");
        }
        return usuarios;

    }

    public void visualizarUsuario(ArrayList<Usuario> usuarios, Scanner sc) {
        Usuario n = acharUsuario(usuarios, sc);
        if (n != null) {
            n.toString();
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Nome:      " + getNome() + "\n" +
                "CPF:      " + getCpf() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Endereço: " + getRua() + " Nº " + getNumero() + " " + getBairro() + " - " + getCidade() + "\n" +
                "Data de Nascimento: " + getDataDeNascimento();
    }

    public void listarUsuarios(ArrayList<Usuario> usuarios) {
        int i = 0;
        for (Usuario n : usuarios) {
            System.out.println("Usuario " + (i + 1) + ":");
            System.out.println(n.toString());
            i++;
        }
    }

    public Usuario acharUsuario(ArrayList<Usuario> usuarios, Scanner sc) {
        System.out.println("informe o nome do usuário: ");
        String nome = pediNovaInfo(sc, "nome");
        String cpf = pediNovaInfo(sc, "cpf");

        for (Usuario n : usuarios) {
            if (nome.equals(n.getNome()) && Integer.parseInt(cpf) == n.getCpf()) {
                return n;
            }
        }
        System.out.println("Usuário não encontrado!");
        return null;
    }

    private String pediNovaInfo(Scanner sc, String qual) {
        String novaInfo;
        while (true) {
            try {
                novaInfo = sc.nextLine();
                if (verificaInfo(qual, novaInfo)) {
                    break;
                }
            } catch (Exception n) {
                System.out.println("ERRO!" + n.getMessage() + "\nTente novamente:");
            }
        }
        return novaInfo;
    }

    private boolean verificaInfo(String qual, String novaInfo) {
        switch (qual) {
            case "nome":
                if (novaInfo.matches("^[A-Za-zÁ-Üá-ü]+( [A-Za-zÁ-Üá-ü]+)*$")) {
                    return true;
                }
                break;
            case "senha":
                if (novaInfo.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")) {
                    return true;
                }
                break;
            case "cpf":
                if (novaInfo.matches("\\d{11}")) {
                    return true;
                }
                break;
            case "telefone":
                if (novaInfo.matches("\\d{11}")) {
                    return true;
                }
                break;
            case "cidade":

            case "bairro":

            case "rua":
                if (novaInfo.matches("^[A-Za-zÁ-Üá-ü]+( [A-Za-zÁ-Üá-ü]+)*$")) {
                    return true;
                }
                break;
            case "numero":
                if (novaInfo.matches("\\d{1,4}")) {
                    return true;
                }
                break;
            case "dataDeNascimento":
                // confere a data no formado dd/mm/aaaa ou dd mm aaaa
                if (novaInfo.matches("\\d{2}/\\d{2}/\\d{4}") || novaInfo.matches("\\d{2} \\d{2} \\d{4}")) {
                    return true;
                }
                break;
            default:
                System.out.println(qual + " não é uma opção valida!");
                break;
        }
        return false;
    }

    // get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
