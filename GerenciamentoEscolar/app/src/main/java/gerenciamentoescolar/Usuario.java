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
        String nome = sc.nextLine();
        
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        
        int cpf;
        while(true){
            try{
                System.out.println("CPF: ");
                cpf = Integer.parseInt(sc.nextLine());//converte o valor representado na String em int
                break;
            }catch(NumberFormatException n){
                System.out.println("CPF inválido. tente novamente.");
            }
        }
        
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("cidade: ");
        String cidade = sc.nextLine();
        
        System.out.print("bairro: ");
        String bairro = sc.nextLine();
        
        System.out.print("rua: ");
        String rua = sc.nextLine();
        
        int numero;
        while(true){
            try{
                System.out.print("numero: ");
                numero = Integer.parseInt(sc.nextLine());//converte o valor representado na String em int
                break;
            }catch(NumberFormatException n){
                System.out.println("Numero inválido. tente novamente.");
            }
        }
        
        sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = sc.nextLine();

        Usuario novo = new Usuario(nome, senha, cpf, telefone, cidade, bairro, rua, numero, dataDeNascimento);
        return novo;
    }//chama o contrudor e retorna um objeto Usuario novo

    public void editarUsuario(Scanner sc, ArrayList<Usuario> usuarios){
        System.out.println("Editar informações do usuário:");
        //qual usuario?

        System.out.println("Qual informação editar?");
        String opcaoEd = sc.nextLine();
        System.out.println("Nova informação:");
        String novaInfo = sc.nextLine();

        switch (opcaoEd) {
            case "nome":
                this.nome = novaInfo;
                break;
            case "senha":
                this.senha = novaInfo;
                break;
            case "cpf":
                while(true){
                    try{
                        this.cpf = Integer.parseInt(novaInfo);//converte o valor representado na String em int
                        break;
                    }catch(NumberFormatException n){
                        System.out.println(novaInfo+" não é um CPF valido!");
                        System.out.println(n.getMessage());
                    }
                }
                break;
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
                while(true){
                    try{
                        this.numero = Integer.parseInt(novaInfo);//converte o valor representado na String em int
                        break;
                    }catch(NumberFormatException n){
                        System.out.println(novaInfo+" não é um numero valido!");
                    }
                }
                break;
            case "dataDeNascimento":
                this.dataDeNascimento = novaInfo;
                break;
            default:
                System.out.println(opcaoEd+" não é uma opção valida!");
                break;
        }
    }

    public ArrayList<Usuario> excluirUsuario(ArrayList<Usuario> usuarios, Scanner sc){
        System.out.println("Excluir usuário.");
        Usuario n = acharUsuario(usuarios, sc);
        if(n != null){
            usuarios.remove(n);
            System.out.println("Usuário removido.");
        }else{
            System.out.println("usuario não encontrado");
        }
        return usuarios;

    }

    public void visualizarUsuario(ArrayList<Usuario> usuarios, Scanner sc){
        Usuario n = acharUsuario(usuarios, sc);
        n.toString();
    }

    public String toString(){
        return "Nome:      "+getNome()+"\n"+
                "CPF:      "+getCpf()+"\n"+
                "Telefone: "+getTelefone()+"\n"+
                "Endereço: "+getRua()+" Nº "+getNumero()+" "+getBairro()+" - "+getCidade()+"\n"+
                "Data de Nascimento: "+getDataDeNascimento();
    }

    public void listarUsuarios(ArrayList<Usuario> usuarios){
        int i = 0;
        for(Usuario n: usuarios){
            System.out.println("Usuario "+(i+1)+":");
            System.out.println(n.toString());
            i++;
        }
    }

    public Usuario acharUsuario(ArrayList<Usuario> usuarios, Scanner sc){
        System.out.println("informe o nome do usuário: ");
        String nome = sc.nextLine();
        int cpf;
        while(true){
            try{
                System.out.println("Informe o CPF do usuário: ");
                cpf = Integer.parseInt(sc.nextLine());//converte o valor representado na String em int
                break;
            }catch(NumberFormatException n){
                System.out.println("CPF inválido. tente novamente.");
            }
        }

        for(Usuario n: usuarios){
            if(nome.equals(n.getNome()) && cpf == n.getCpf()){
                return n;
            }
        }

        return null;
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
