package br.com.dio.exercicios.arrays;

/* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final mostro os números e seus sucessores.
 */

import java.util.Random;

public class exc3_numerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessor de Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
        System.out.println("\nAntecessor de Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }
    }
}
