package escola;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario novo = new Usuario(null, null, null, null, null, null, null, null, null);
        Scanner sc = new Scanner(System.in);
        String cpf;
        String senha;
        int opcao;
        // carregarUsuariosTxt(usuarios);
        System.out.println("Digite 1 para login\nDigite 2 para cadastra usuario");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                while (true) {
                    System.out.println(
                            "-----------------------Login-----------------------" + "\n" + "Digite o CPF do usuario");
                    cpf = Usuario.pediNovaInfo(sc, "cpf");
                    System.out.println("Digite a senha do usuario");
                    senha = Usuario.pediNovaInfo(sc, "senha");
                    for (Usuario n : usuarios) {
                        if (cpf.equals(n.getCpf()) && senha == n.getSenha()) {
                            System.out.println("-----------------------Menu-----------------------" + "\n" +
                                    "Digite o valor corespondente a uma das opções." + "\n" +
                                    "1 - Matricula" + "\n" + "2 - Notas" + "\n" + "3 - Agendamento de Reunião" + "\n"
                                    + "4 - Disciplina");

                        }
                    }
                    break;
                }
                break;
            case 2: 

            break;
            
            default:
                break;
        }

    }
}