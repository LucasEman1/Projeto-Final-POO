package gerenciamentoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuario = new ArrayList<>();

        Usuario novo = new Usuario(null, null, 0, null, null, null, null, 0, null);
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite informações de usuário: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        novo.setNome(nome);
        System.out.println();

        System.out.print("Senha: ");
        String senha = sc.nextLine();
        novo.setSenha(senha);
        System.out.println();

        System.out.print("CPF: ");
        int cpf = sc.nextInt();
        novo.setCpf(cpf);
        System.out.println();

        System.out.print("Telefone: ");
        String Telefone = sc.nextLine();
        novo.setTelefone(Telefone);
        System.out.println();

        System.out.print("cidade: ");
        String cidade = sc.nextLine();
        novo.setCidade(cidade);
        System.out.println();

        System.out.print("bairro: ");
        String bairro = sc.nextLine();
        novo.setBairro(bairro);
        System.out.println();

        System.out.print("rua: ");
        String rua = sc.nextLine();
        novo.setRua(rua);
        System.out.println();

        System.out.print("numero: ");
        int numero = sc.nextInt();
        novo.setNumero(numero);
        System.out.println();

        System.out.print("Data de Nascimento: ");
        String dataDeNascimento = sc.nextLine();
        novo.setDataDeNascimento(dataDeNascimento);
        System.out.println();

        System.out.println("cadastro criado");
        usuario.add(novo);
        sc.close();
    }
}
