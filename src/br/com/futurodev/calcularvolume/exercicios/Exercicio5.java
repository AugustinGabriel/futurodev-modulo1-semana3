package br.com.futurodev.calcularvolume.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seus passatempos (para sair digite \"fechar\"):");
        List<String> passatempos = new ArrayList<>();
        String passatempoInformado;
        do{
            passatempoInformado = entrada.nextLine();
            if (!passatempoInformado.toUpperCase().equals("FECHAR")) { // ".toUpperCase" transforma o conteúdo de "passatempo" em MAIÚSCULO
                passatempos.add(passatempoInformado); // Adiciona na lista de passatempos
                System.out.println("Passatempo inserido com sucesso!\n");
            }
        } while (!passatempoInformado.toUpperCase().equals("FECHAR")); // Repete o laço enquanto o usuário NÃO digitar

        System.out.println("\nSeus passatempos inseridos foram:");
        for (String passatempo : passatempos) { // Percorre a lista de passatempos
            System.out.println(passatempo);
        }

    }
}
