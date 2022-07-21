package br.com.futurodev.calcularvolume.dowhiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {

        final int LIMITE = 6; // Quantidade de número a serem sorteados
        final int NUMERO_MAXIMO = 60; // Número máximo a ser sorteado

        // Armazena os números sorteados
        List<Integer> sorteados = new ArrayList<>();

        // "i" é o contador utilizado para o do-while abaixo
        int i = 0;
        do {
            // Soteia um novo número
            int numeroAleatorio = new Random().nextInt(NUMERO_MAXIMO + 1);

            boolean encontreiNumero = false;

            // "j" é o contador utilizado para o while abaixo
            int j = 0;
            while (j < sorteados.size()) { // while para buscar um número duplicado

                // Verifica se o número sorteado já foi usado no nosso ArrayList
                Integer numeroAuxiliar = sorteados.get(j);
                if (numeroAleatorio == numeroAuxiliar) {
                    encontreiNumero = true; // Indica que encontrou o mesmo numero sorteado
                    break; // Encerra o loop de busca
                }
                j++; // Incrementa a variável "j". É o mesmo que fazer j = j + 1;
            }

            // Ponto de exclamação serve para negar uma variável boolean (Se for VERDADEIRO/TRUE a condição se tornará FALSO/FALSE)
            if (!encontreiNumero && numeroAleatorio > 0) { // Se (!)NÃO encontrei o número E o numeroAleatorio maior que ZERO
                sorteados.add(numeroAleatorio); // Adiciona o numeroAleatório na lista de sorteados
                i++; // Incrementa a variável "i". É o mesmo que fazer i = i + 1;
            }

        } while (i < LIMITE); // Executa o laço "enquanto" a variável "i" for menor que "LIMITE"

        // função ".sort" ordena os elementos do ArrayList em ordem crescente
        sorteados.sort((e1, e2) -> e1 > e2 ? 1 : -1);
        /*
        sorteados.sort((Integer e1, Integer e2) {
          if (e1 > e2) {
            return 1;
          } else {
            return -1;
          }
        });
        */

        // "i" é o contador utilizado para o while abaixo
        i = 0;
        while (i < sorteados.size()) {
            System.out.print(" " + sorteados.get(i));
            i++; // Incrementa a variável "i". É o mesmo que fazer i = i + 1;
        }

    }

}
