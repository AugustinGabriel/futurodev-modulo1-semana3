package br.com.futurodev.calcularvolume.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        final int NUMERO_MAXIMO = 100; // Número máximo para ser sorteado

        int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1); // Cria um numero aleátorio de 0 à "NUMERO_MAXIMO"

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número múltiplo de " + numeroAleatorio + ":");
        int numero = 0;
        do{
            numero = entrada.nextInt();
        } while (numero % numeroAleatorio != 0); // Repete o laço enquanto o resto da divisão de "numero" pelo "numeroAleatorio" NÃO for ZERO (enquanto não for múltiplos)

        System.out.println("\nParabéns! Os números são múltiplos");

    }
}
