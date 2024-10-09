package escola.testes;

import java.util.Scanner;

import escola.Aluno;

public class testeAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno(null, null, 0, null, null, null, null, 0, null, null, null, false);
        aluno.criarAluno(sc);
    }
}
