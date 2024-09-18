package gerenciamentoescolar;

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
    public void criarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--CADASTRO--");
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();
        System.out.println("Digite seu cpf: ");
        cpf = sc.nextInt();

        sc.nextLine();
        System.out.println("Data de Nascimento: ");
        dataDeNascimento = sc.nextLine();

        System.out.println("Seu telefone: ");
        telefone = sc.nextLine();
        System.out.println("Cidade: ");
        cidade = sc.nextLine();
        System.out.println("Bairro: ");
        bairro = sc.nextLine();
        System.out.println("Rua: ");
        rua = sc.nextLine();
        System.out.println("Número: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("--cadastro realizado--");

        sc.close();
    }

    public void editarUsuario() {

    }

    public void excluirUsuario() {

    }

    public void visualizarUsuario() {

    }

    public void listarUsuarios() {

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
