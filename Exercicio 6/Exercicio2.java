/*Faça um Programa que leia um vetor de 10 números reais e mostre-os na
ordem inversa. */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] contrario = {1,2,3,4,6,5,7,8,9,10};

        for (int i = contrario.length - 1; i >= 0; i--) {
            System.out.println(contrario[i]);
        }

        inputScanner.close();
    }
}