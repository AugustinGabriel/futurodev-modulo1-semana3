package br.com.futurodev.calcularvolume.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        final int TAMANHO_ARRAY = 10; // Constante indicando o tamanho do array

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[TAMANHO_ARRAY]; // Cria um array do tamanho de TAMANHO_ARRAY

        System.out.println("Informe " + TAMANHO_ARRAY + " números");
        for (int i = 0; i < numeros.length; i++) { // Laço de repetição que executa enquanto não percorrer o array inteiro
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Os números informados foram:");
        for (int numero : numeros) { // Percorre o array
            System.out.print(" " + numero);
        }
        System.out.print("\n"); // Imprime quebra de linha

    }
}
