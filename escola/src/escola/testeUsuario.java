package escola;

import java.util.Scanner;
import java.util.ArrayList;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario novo = new Usuario(null, null, null, null, null, null, null, 0, null);
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        while (true) {
            switch (i) {
                case "1":
                    // criar usuário.
                    usuarios.add(novo.criarUsuario(sc));
                    break;
                case "2":
                    // edita informações do usuario
                    novo.editarUsuario(usuarios, sc);
                    break;
                case "3":
                    // excluir usuário.
                    novo.excluirUsuario(usuarios, sc);
                    break;
                case "4":
                    // visualizar usuário
                    novo.visualizarUsuario(usuarios, sc);
                    break;
                case "5":
                    // listar usuários
                    novo.listarUsuarios(usuarios);
                    break;
            }
        }
    }
}
