package gerenciamentoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuario = new ArrayList<>();
        Usuario novo = new Usuario(null, null, 0, null, null, null, null, 0, null);
        Scanner sc = new Scanner(System.in);
 
        //chama o metodo criarUsuario da clase Usuario como parametro do comando add para adicionar um novo Usuario a lista usuarios.
        usuario.add(novo.criarUsuario(novo));

        System.out.println(novo.visualizarUsuario());

        //edita informações do usuario. Mas de qual?
        System.out.println("Editar informações do usuario:\nqual dado gostaria de editar?");
        String opcaoEd = sc.nextLine();
        System.out.println("Nova informação:");
        String novaInfo = sc.nextLine();
        novo.editarUsuario(opcaoEd, novaInfo);



        sc.close();
    }
}
