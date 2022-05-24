package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
/*
            no codigo abaixo,
            fiz o processo inverso para simplifcar o codigo
            atendendo o pedido do exercicio.:

            int count = 5
            while (count < vetor.length+1){
            System.out.print(vetor[count] + " ");
            count--;
            */
public class exc1_ordeminversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        int i;
        System.out.print("\nVetor Inverso: ");
        for (i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
