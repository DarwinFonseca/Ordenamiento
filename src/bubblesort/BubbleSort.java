/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this auxlate file, choose Tools | Templates
 * and open the auxlate in the editor.
 */
package bubblesort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Darwin Fonseca
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el arreglo con comas:");
        String Entrada = sc.nextLine();
        StringTokenizer st = new StringTokenizer(Entrada, ",");
        int n = st.countTokens();
        int[] Arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            Arreglo[i] = Integer.parseInt(st.nextToken());
        }


        bubbleSort(Arreglo, Arreglo.length);

        System.out.println("Arreglo Ordenado : ");
        System.out.println(Arrays.toString(Arreglo));

    }

    static void bubbleSort(int Arreglo[], int tamano) {
        //si solo hay un número
        if (tamano == 1) {
            return;
        }

        for (int i = 0; i < tamano - 1; i++) {
            if (Arreglo[i] > Arreglo[i + 1]) {

                int aux = Arreglo[i];
                Arreglo[i] = Arreglo[i + 1];
                Arreglo[i + 1] = aux;
            }
        }

        bubbleSort(Arreglo, tamano - 1);
    }

}
