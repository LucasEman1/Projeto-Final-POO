package escola.testes;

import escola.Notas;

import java.util.Scanner;

public class testeNotas {
    public static void main(String[] args) {
        String caminhoArquivo = "src\\escola\\arquivos\\notas.txt";
        Notas notas = new Notas(0, 0, 0);
        Scanner sc = new Scanner(System.in);
        int caso;
        do {
            System.out.println(" ");
            System.out.println("Criar Nota: 1 ");
            System.out.println("Editar Nota: 2 ");
            System.out.println("Excluir Nota: 3 ");
            System.out.println("Visualizar Notas: 4 ");
            System.out.print("opcao: ");
            caso = sc.nextInt();
            Notas notasCarregadas = new Notas(0, 0, 0);
            notasCarregadas.carregarNotas(caminhoArquivo); 
            switch (caso) {
                case 1:
                    notas.criarNotas(sc);
                    notas.salvarNotas(caminhoArquivo);
                    break;
                case 2:
                    notas.editarNotas(sc);
                    break;
                case 3:
                    notas.excluirNotas(sc);
                    break;
                case 4:
                    notas.visualizarNotas();
                    notasCarregadas.visualizarNotas();
                    break;
                default:
                    break;
            }
        } while (caso != 0);
        sc.close();
    }
}
