package br.com.futurodev.calcularvolume.whiles;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores: ");
        int quantidade = entrada.nextInt();
        System.out.println("");

        double result = 0;
        int i = 0;
        while (i < quantidade) {
            // Peço a operação a partir do segundo loop
            String operacao = "l";
            if (i > 0) {
                System.out.println("#############");
                System.out.println("# Operações #");
                System.out.println("#############");
                System.out.println("Somar      : \"+\"");
                System.out.println("Subtrair   : \"-\"");
                System.out.println("Multiplicar: \"*\"");
                System.out.println("Dividir    : \"/\"");
                System.out.println("Corrigir   : \"c\"");
                System.out.println("Limpar     : \"l\"");
                System.out.print("Informe a operação desejada: ");
                operacao = entrada.next();
            }

            // Informa o valor para executar a operação
            System.out.print("Informe um valor: ");
            switch (operacao) {
                case "+":
                    result += entrada.nextDouble();
                    break;
                case "-":
                    result -= entrada.nextDouble();
                    break;
                case "*":
                    result *= entrada.nextDouble();
                    break;
                case "/":
                    result /= entrada.nextDouble();
                    break;
                case "l":
                    result = entrada.nextDouble();
                    i = 0;
                    break;
                default:
                    System.out.println("Comando inválido");
                    i--;
                    break;
            }

            i++;
        }

        System.out.println("\nO resultado é de: " + result);
    }

}
