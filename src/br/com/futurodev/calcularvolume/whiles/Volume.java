package br.com.futurodev.calcularvolume.whiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Double> dimensoes = new ArrayList<>();
        int quantidade;

        System.out.print("Informe a quantidade de dimensões: ");
        quantidade = entrada.nextInt();

        System.out.println("Informe as dimensões: ");
        int i = 0;
        while (i < quantidade) {
            dimensoes.add(entrada.nextDouble());
            i = i + 1;
        }

        i = 0;
        double volume = 1;
        while (i < quantidade) {
            volume = (volume * dimensoes.get(i));
            i++;
        }

        System.out.println("\nO resulta é de: " + volume);
    }

}
