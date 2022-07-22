package br.com.futurodev.calcularvolume.fors;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        List<String> listaCompras = new ArrayList<>();

//        /** INICIO - Introdução ao for */
        listaCompras.add("Arroz");
        listaCompras.add("Feijão");
        listaCompras.add("Batata");
        listaCompras.add("Macarrão");
//
//        // For normal
//        for (int i = 0; i < listaCompras.size(); i++) {
//            String item = listaCompras.get(i);
//            System.out.println(item);
//        }
//
//        // Foreach
//        for (String item : listaCompras) {
//            System.out.println(item);
//        }
//        /** FIM - Introdução ao for */

        System.out.println("Bem-vindo à sua lista de compras \n\n");

        Scanner entrada = new Scanner(System.in);
        while (true) {

            // Funcionalidade
            // 1 - Listar os itens
            // 2 - Incluir item
            // 3 - Remover item
            // 0 - Sair do sistema

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar os itens");
            System.out.println("2 - Incluir item");
            System.out.println("3 - Remover item");
            System.out.println("4 - Limpar a lista");
            System.out.println("\n0 - Sair do sistema\n");

            System.out.print("Opção: ");
            String opcao = entrada.next();

            /*
             * ".equals" - Precisa ser utilizado em Objetos
             *  para que sejam comparados os valores do objeto
             *  e NÃO sua referência na memória.
             */
            if (opcao.equals("0")) { // Sair do sistema;

                System.out.println("\nSaindo...");
                System.out.println(".");
                System.out.println(".");
                System.out.println("Bye :)");
                break; // Comando para sair do LOOP

            } else if (opcao.equals("1")) { // Listar itens

                System.out.println("\n\n###################");
                System.out.println("# Lista dos itens #");
                System.out.println("###################");
                for (String item : listaCompras) {
                    System.out.println(item);
                }
                System.out.println("\n\n");

            } else if (opcao.equals("2")) { // Incluir item

                System.out.println("\nIncluindo");
                System.out.print("Descreva o item: ");
                String item = entrada.next();
                listaCompras.add(item);
                System.out.println("\nItem adicionado com sucesso!\n\n");

            } else if (opcao.equals("3")) { // Remover itens

                System.out.println("\n\nEscolha o item que deseja remover: ");
                for (int i = 0; i < listaCompras.size(); i++) {
                    /* Atribui ao "item" o valor do índice da nossa lista */
                    String item = listaCompras.get(i);
                    System.out.println( i + " - " + item);
                }
                System.out.print("\nItem: ");
                int indiceItem = entrada.nextInt();

//                listaCompras.remove(indiceItem); // Função ".remove" retira da lista o item presente no indice informado
                for (int i = 0; i < listaCompras.size(); i++) {
                    System.out.println("Procurando item na lista...");

                    if (indiceItem != i) {
                        continue;
                    }

                    listaCompras.remove(indiceItem); // Função ".remove" retira da lista o item presente no indice informado
                    break;
                }

                System.out.println("\nItem removido com sucesso\n");

            } else if (opcao.equals("4")) { // Limpar lista

                System.out.print("Você tem certeza absoluta " +
                        "que deseja limpar a lista? (S/N) ");
                String confirmacao = entrada.next();

                confirmacao = confirmacao.toUpperCase(); // Torna a informação em MAIÚSCULO
                if (confirmacao.equals("S")) {
                    listaCompras.clear();
                    System.out.println("Sua lista de compras foi reiniciada!\n");
                } else {
                    System.out.println("Operação cancelada!\n");
                }

            }

        }

    }

}
