package br.com.futurodev.calcularvolume.arrays;

import java.util.Scanner;

public class ComArray {
    public static void main(String[] args) {
        double[] dimensoes = new double[3];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome na sequencia a Largura, Comprimento e Altura: ");
        dimensoes[0] = entrada.nextDouble();
        dimensoes[1] = entrada.nextDouble();
        dimensoes[2] = entrada.nextDouble();

        double volume = dimensoes[0] * dimensoes[1] * dimensoes[2];
        System.out.println("Seu volume é: " + volume);

    }
}
