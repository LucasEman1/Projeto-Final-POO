package escola;

import java.io.*;
import java.util.Scanner;

public class Notas {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

    public Notas(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = calcularMedia();
        this.situacao = calculaSituacao();
    }

    private float calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    private String calculaSituacao() {
        if (media > 7.0) {
            situacao = "Você está aprovado";
        } else {
            situacao = "Você está reprovado";
        }
        return situacao;
    }

    public void criarNotas(Scanner sc) {
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextFloat();
        System.out.println("");

        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextFloat();
        System.out.println("");

        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextFloat();
        System.out.println("");

        media = calcularMedia();
        situacao = calculaSituacao();
        System.out.println(toString());

    }

    public void salvarNotas(String caminhoArquivo) {
        try (FileWriter salva = new FileWriter(caminhoArquivo, true)) {
            BufferedWriter escreve = new BufferedWriter(salva);
            salva.write(nota1 + "\n" + nota2 + "\n" + nota3 + "\n" + media + "\n" + situacao + "\n");
            System.out.println("Notas salvas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar notas: " + e.getMessage());
        }
    }

        // Método para carregar as notas do arquivo
    public void carregarNotas(String caminhoArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            nota1 = Float.parseFloat(reader.readLine());
            nota2 = Float.parseFloat(reader.readLine());
            nota3 = Float.parseFloat(reader.readLine());
            media = Float.parseFloat(reader.readLine());
            situacao = reader.readLine();
            System.out.println("Notas carregadas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar notas: " + e.getMessage());
        }
    }

    public void editarNotas(Scanner sc) {
        System.out.print("Deseja editar qual nota? 1|2|3 ");
        int qual = sc.nextInt();

        switch (qual) {
            case 1:
                System.out.print("Nova nota: ");
                setNota1(sc.nextFloat());

                setMedia(media = (nota1 + nota2 + nota3) / 3);

                System.out.println(toString());
                break;
            case 2:
                System.out.print("Nova nota: ");
                setNota2(sc.nextFloat());

                setMedia(media = (nota1 + nota2 + nota3) / 3);

                System.out.println(toString());
                break;
            case 3:
                System.out.print("Nova nota: ");
                setNota3(sc.nextFloat());

                setMedia(media = (nota1 + nota2 + nota3) / 3);

                System.out.println(toString());
                break;
            default:
                System.out.println("Opção não existe");
                break;
        }
    }

    public void excluirNotas(Scanner sc) {
        System.out.print("Deseja excluir qual nota? 1|2|3 ");
        int qual = sc.nextInt();
        switch (qual) {
            case 1:
                try {
                    setNota1(0);
                    System.out.println("Nota excluida!");
                    setMedia(media = (nota1 + nota2 + nota3) / 3);
                } catch (Exception e) {
                    System.out.println("Erro" + e.getMessage());
                }
                break;
            case 2:
                try {
                    setNota2(0);
                    System.out.println("Nota excluida!");
                    setMedia(media = (nota1 + nota2 + nota3) / 3);
                } catch (Exception e) {
                    System.out.println("Erro" + e.getMessage());
                }
                break;
            case 3:
                try {
                    setNota3(0);
                    System.out.println("Nota excluida!");
                    setMedia(media = (nota1 + nota2 + nota3) / 3);
                } catch (Exception e) {
                    System.out.println("Erro" + e.getMessage());
                }
                break;
            default:
                System.out.println("Opcão não existe");
                break;
        }
    }

    public void visualizarNotas() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Notas [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", media=" + media + ", situacao="
                + situacao + "]";
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}