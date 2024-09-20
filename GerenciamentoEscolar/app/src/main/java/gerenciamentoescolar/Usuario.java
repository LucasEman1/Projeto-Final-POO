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
    public Usuario criarUsuario(Usuario novo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite informações de usuário: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        novo.setNome(nome);
        

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        novo.setSenha(senha);
        

        System.out.print("CPF: ");
        int cpf = sc.nextInt();
        novo.setCpf(cpf);
        
        sc.nextLine();

        System.out.print("Telefone: ");
        String Telefone = sc.nextLine();
        novo.setTelefone(Telefone);
        

        System.out.print("cidade: ");
        String cidade = sc.nextLine();
        novo.setCidade(cidade);
        

        System.out.print("bairro: ");
        String bairro = sc.nextLine();
        novo.setBairro(bairro);
        

        System.out.print("rua: ");
        String rua = sc.nextLine();
        novo.setRua(rua);
        

        System.out.print("numero: ");
        int numero = sc.nextInt();
        novo.setNumero(numero);
        
        sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = sc.nextLine();
        novo.setDataDeNascimento(dataDeNascimento);

        sc.close();
        return novo;
    }//chama o contrudor e retorna um objeto Usuario novo

    public void editarUsuario(String opcaoEd, String novaInfo ){
        switch (opcaoEd) {
            case "nome":
                this.nome = novaInfo;
                break;
            case "senha":
                this.senha = novaInfo;
                break;
            case "cpf":
                try{
                this.cpf = Integer.parseInt(novaInfo);//converte o valor representado na String em int
                break;
                }catch(NumberFormatException n){
                    System.out.println(novaInfo+" não é um CPF valido!");
                    System.out.println(n.getMessage());
                }
            case "telefone":
                this.telefone = novaInfo;
                break;
            case "cidade":
                this.cidade = novaInfo;
                break;
            case "bairro":
                this.bairro = novaInfo;
                break;
            case "rua":
                this.rua = novaInfo;
                break;
            case "numero":
                try{
                this.numero = Integer.parseInt(novaInfo);//converte o valor representado na String em int
                break;
                }catch(NumberFormatException n){
                    System.out.println(novaInfo+" não é um numero valido!");
                }
            case "dataDeNascimento":
                this.dataDeNascimento = novaInfo;
                break;
            default:
                System.out.println(opcaoEd+" não é uma opção valida!");
                break;
        }
    }

    public void excluirUsuario() {

    }

    public String visualizarUsuario(){
        return "Nome:      "+getNome()+"\n"+
                "CPF:      "+getCpf()+"\n"+
                "Telefone: "+getTelefone()+"\n"+
                "Endereço: "+getRua()+" Nº "+getNumero()+" "+getBairro()+" - "+getCidade()+"\n"+
                "Data de Nascimento: "+getDataDeNascimento();
    }

    public void listarUsuarios(ArrayList<Usuario> usuarios){
        int i = 0;
        for(Usuario n: usuarios){
            System.out.println("Usuario "+i+":");
            System.out.println(n.visualizarUsuario());
            i++;
        }
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
