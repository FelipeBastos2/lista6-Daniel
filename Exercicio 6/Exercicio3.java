/*3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double[] notas ={25,28.5,17.4,30};
        for(int i= 0;i<notas.length ;i++){
            System.out.println(notas[i]);
        }
        double soma =0;
        for(double nota:notas){
            soma += nota;   
        }
        
        double media = soma/notas.length;
       
        System.out.println("Média: " +media);

        inputScanner.close();
    }
    
}
