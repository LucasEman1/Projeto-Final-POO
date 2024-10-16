package escola;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario novo = new Usuario(null, null, null, null, null, null, null, null, null);
        Scanner sc = new Scanner(System.in);
        String cpf;
        String senha;
        // carregarUsuariosTxt(usuarios);

        System.out.println("-----------------------Login-----------------------" + "\n" + "Digite o CPF do usuario");
        cpf = Usuario.pediNovaInfo(sc, "cpf");
        System.out.println("Digite a senha do usuario");
        senha = Usuario.pediNovaInfo(sc, "senha");

        System.out.println("-----------------------Menu-----------------------" + "\n" +
                "Digite o valor corespondente a uma das opções." + "\n" +
                "1 - ");

        sc.close();
    }
}