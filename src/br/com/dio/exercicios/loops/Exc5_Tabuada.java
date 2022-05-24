package br.com.dio.exercicios.loops;
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabudade de 5:
5x1 = 5
5x2 = 10
...
5x10 = 50

 */

import java.util.Scanner;

public class Exc5_Tabuada {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

         for(int i = 1; i <= 10; i++) {

             System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

         }
    }
}
