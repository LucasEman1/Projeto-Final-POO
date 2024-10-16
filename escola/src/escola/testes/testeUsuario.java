package escola.testes;

import java.io.*;
import java.util.ArrayList;

import escola.Usuario;

public class testeUsuario {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario novo = new Usuario(null, null, 0, null, null, null, null, 0, null);
        Scanner sc = new Scanner(System.in);
        
        //carregarUsuariosTxt(usuarios);
        
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

    /* Método para salvar usuários em arquivo de texto
    public static void salvarUsuariosTxt(ArrayList<Usuario> usuarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt"))) {
            for (Usuario usuario : usuarios) {
                writer.write(usuario.getNome() + "\n" + usuario.getSobrenome() + "\n" +
                             usuario.getIdade() + "\n" + usuario.getCpf() + "\n" +
                             usuario.getTelefone() + "\n" + usuario.getEmail() + "\n" +
                             usuario.getEndereco() + "\n" + usuario.getMatricula() + "\n" +
                             usuario.getCurso() + "\n");
                writer.newLine(); // Adiciona uma nova linha para o próximo usuário
            }
            System.out.println("Usuários salvos em arquivo de texto com sucesso!");
        } catch (IOException n) {
            System.out.println("Erro ao salvar os usuários: " + n.getMessage());
        }
    }

    // Método para carregar usuários de arquivo de texto
    public static void carregarUsuariosTxt(ArrayList<Usuario> usuarios) {
        try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split("\n");
                Usuario usuario = new Usuario(
                        dados[0], dados[1], dados[2], dados[3], 
                        dados[4], dados[5], dados[6], Integer.parseInt(dados[7]), dados[8]);
                usuarios.add(usuario);
            }
            System.out.println("Usuários carregados do arquivo de texto.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar os usuários: " + e.getMessage());
        }
    }
}*/
