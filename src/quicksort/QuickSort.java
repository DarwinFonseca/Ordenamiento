/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DarwinFonck
 */
public class QuickSort {

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

        QuickSort ob = new QuickSort();

        ob.sort(Arreglo, 0, n - 1);

        System.out.println("\nArreglo ordenado: ");
        System.out.println(Arrays.toString(Arreglo));
    }

    int partition(int Arreglo[], int bajo, int alto) {
        int pivot = Arreglo[alto];
        int i = (bajo - 1); // indice maspequeño
        for (int j = bajo; j < alto; j++) {
            // si la posicion es menor o igual al pivote
            if (Arreglo[j] <= pivot) {
                i++;

                // intercambia posiciones i y j 
                int temp = Arreglo[i];
                Arreglo[i] = Arreglo[j];
                Arreglo[j] = temp;
            }
  System.out.println(Arrays.toString(Arreglo));

        }

        // Intercambia Arreglo[i+1] y Arreglo[alto] 
        int temp = Arreglo[i + 1];
        Arreglo[i + 1] = Arreglo[alto];
        Arreglo[alto] = temp;

        return i + 1;
    }

    void sort(int Arreglo[], int bajo, int alto) {
        if (bajo < alto) {
            //Encuentra en indice de particion 
            int pi = partition(Arreglo, bajo, alto);
            sort(Arreglo, bajo, pi - 1);
            sort(Arreglo, pi + 1, alto);
        }
    }

}
