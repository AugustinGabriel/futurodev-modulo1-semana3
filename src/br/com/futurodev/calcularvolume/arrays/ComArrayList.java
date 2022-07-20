package br.com.futurodev.calcularvolume.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComArrayList {
    public static void main(String[] args) {
//        double[] dimensoes = new double[3];
        List<Double> dimensoes = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome na sequencia a Largura, Comprimento e Altura: ");
//        dimensoes[0] = entrada.nextDouble();
        dimensoes.add(entrada.nextDouble());
        dimensoes.add(entrada.nextDouble());
        dimensoes.add(entrada.nextDouble());

//        double volume = dimensoes[0] * dimensoes[1] * dimensoes[2];
        double volume = dimensoes.get(0) * dimensoes.get(1) * dimensoes.get(2);
        System.out.println("Seu volume é: " + volume);

    }
}
