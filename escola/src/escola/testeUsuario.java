package escola;

import java.util.Scanner;
import java.util.ArrayList;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario novo = new Usuario(null, null, 0, null, null, null, null, 0, null);
        Scanner sc = new Scanner(System.in);
 
        //criar usuário.
        usuarios.add(novo.criarUsuario(sc));

        //edita informações do usuario.
        novo.editarUsuario(usuarios, sc);

        //excluir usuário.
        novo.excluirUsuario(usuarios, sc);

        //visualizar usuário
        novo.visualizarUsuario(usuarios, sc);

        //listar usuários
        novo.listarUsuarios(usuarios);

        sc.close();
    }
}
