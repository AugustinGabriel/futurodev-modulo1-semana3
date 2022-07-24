package br.com.futurodev.calcularvolume.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        final int TAMANHO_ARRAY = 3; // Constante indicando o tamanho do array

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[TAMANHO_ARRAY]; // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("Informe " + TAMANHO_ARRAY + " notas para calcular a média:");
        for (int i = 0; i < notas.length; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            notas[i] = entrada.nextDouble();
        }

        double media = 0;
        for (double nota : notas) { // Percorre o array
            media += nota; // Realiza a soma de "media" e "nota"
        }
        media /= TAMANHO_ARRAY; // Divide a "media" por "TAMANHO_ARRAY"
        System.out.print("Sua média é: " + media);

    }
}
