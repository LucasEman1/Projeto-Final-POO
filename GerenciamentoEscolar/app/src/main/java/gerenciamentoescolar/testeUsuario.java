package gerenciamentoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuario = new ArrayList<>();
        Usuario novo = new Usuario(null, null, 0, null, null, null, null, 0, null);
        Scanner sc = new Scanner(System.in);
 
        usuario.add(novo.criarUsuario(novo));

        System.out.println(novo.visualizarUsuario());

        sc.close();
    }
}
