package gerenciamentoescolar;

import java.util.Scanner;

public class Notas {
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

    public Notas(float nota1, float nota2, float nota3, float media, String situacao){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.situacao = situacao;
    }

    public void criarNotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextInt();
        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextInt();
        System.out.println("Digite a nota 3: ");
        nota3 = scanner.nextInt();

        scanner.close();
    }
    public void editarNotas(){

    }
    public void excluirNotas(){

    }
    public void visualizarNotas(){

    }
    public void listarNotas(){

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
