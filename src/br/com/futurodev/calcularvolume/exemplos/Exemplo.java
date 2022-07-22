package br.com.futurodev.calcularvolume.exemplos;

public class Exemplo {

    public static void main(String[] args) {
        String[] lista = new String[10];
        lista[0] = "Arroz";
        lista[1] = "Feijão";
        lista[2] = "Batata";
        lista[3] = "Macarrão";
        lista[4] = "Pinga";
        lista[5] = "Cerveja";
        lista[6] = "Picanha";
        lista[7] = "Carvão";
        lista[8] = "Aipim";
        lista[9] = "Tomate";

        int i = 0;
        while (i < lista.length) {
            System.out.println(lista[i]);
            i++; // i++ é o mesmo que fazer i = i + 1;
        }

        int contador = 0;
        do {
            System.out.println(lista[contador]);
            contador++; // i++ é o mesmo que fazer i = i + 1;
        } while (contador < lista.length);

        for (int j = 0; j < lista.length; j++) {
            System.out.println(lista[j]);
        }

    }

}
