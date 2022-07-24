package br.com.futurodev.calcularvolume.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas para calcular a média:");
        int quantidade = entrada.nextInt();

        List<Double> notas = new ArrayList<>(); // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("\nInforme abaixo as notas:");
        for (int i = 0; i < quantidade; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            notas.add(entrada.nextDouble());
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= quantidade; // Divide a "media" pela "quantidade"
        System.out.print("Sua média é: " + media);

    }
}
