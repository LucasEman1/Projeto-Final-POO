package escola.testes;

import escola.Notas;

import java.util.Scanner;

public class testeNotas {
    public static void main(String[] args) {
        Notas notas = new Notas(0, 0, 0, 0, null);
        Scanner sc = new Scanner(System.in);

        notas.criarNotas(sc);
    }
}
