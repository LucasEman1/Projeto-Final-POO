package escola;

import java.util.Scanner;

public class Notas {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

    public Notas(float nota1, float nota2, float nota3, float media, String situacao) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.situacao = situacao;
    }

    public void criarNotas(Scanner sc) {
        try {
            System.out.println("Digite a nota 1: ");
            nota1 = sc.nextFloat();
            System.out.println("Digite a nota 2: ");
            nota2 = sc.nextFloat();
            System.out.println("Digite a nota 3: ");
            nota3 = sc.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else {
            situacao = "Em recuperação";
        }

        System.out.println(toString());
    }

    public void editarNotas(Scanner sc) {
        System.out.println("Digite a nota que deseja editar: ");
        int decide = sc.nextInt();
        switch (decide) {
            case 1:
                System.out.println("Nova nota primeira unidade: ");
                nota1 = sc.nextFloat();
                break;
            case 2:
                System.out.println("Nova nota segunda unidade: ");
                nota2 = sc.nextFloat();
                break;
            case 3:
                System.out.println("Nova nota terceira unidade: ");
                nota3 = sc.nextFloat();
                break;
            default:
                break;
        }
    }

    public void excluirNotas() {

    }

    public void visualizarNotas() {

    }

    public void listarNotas() {

    }

    @Override
    public String toString() {
        return "Notas [nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", media=" + media + ", situacao="
                + situacao + "]";
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

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
