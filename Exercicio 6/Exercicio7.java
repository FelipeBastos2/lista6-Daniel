/*Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a
multiplicação e os números. */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;

       
        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            vetor[i] = inputScanner.nextInt();
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }

        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);

        inputScanner.close();
    }
}