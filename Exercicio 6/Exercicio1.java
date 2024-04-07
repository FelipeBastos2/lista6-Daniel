//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os./

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }       
        inputScanner.close();
    }
    
}
