package br.com.futurodev.calcularvolume.arrays;

import java.util.Scanner;

public class SemArray {
    public static void main(String[] args) {
        double largura;
        double comprimento;
        double altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        largura = entrada.nextDouble();

        System.out.print("Digite o comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.print("Digite a altura: ");
        altura = entrada.nextDouble();

        System.out.println(
                "\nLxCxA: " +
                largura + "x" +
                comprimento + "x" +
                altura
        );

        double volume = largura * comprimento * altura;
        System.out.println("\nVolume calculado é de: " + volume);
    }
}
