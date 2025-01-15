// Esercizio: Lavorare con le Matrici in Java
//
// 1. Creare una matrice 3x3 di numeri interi.
// 2. Popolare la matrice con valori casuali compresi tra 1 e 100.
// 3. Implementare un metodo che calcoli la somma di tutti gli elementi della matrice.
// 4. Implementare un metodo che trovi il valore massimo nella matrice.
// 5. Stampare la matrice, la somma degli elementi e il valore massimo trovato.
//
// Suggerimento:
// - Utilizza la classe Random per generare numeri casuali.
// - Per stampare la matrice, usa un ciclo annidato.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // popolamento matrice
        int[][] m = new int[3][3];
        Random random = new Random();
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(100) + 1;        }    }

        // output della matrice
        System.out.println("Matrice:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");       }
            System.out.println(); // a capo alla fine di ogni riga      }
        // calcolo somma di elementi
        int sum = calculateSum(m);
        System.out.println("Somma degli elementi: " + sum);

        // ricerca del valore massimo
        int maxim = findMax(m);
        System.out.println("Valore massimo: " + maxim);}}

    public static int calculateSum(int[][] m) {
        int sum = 0;
        // somma di tutti gli elementi della matrice
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];         }   }
        return sum; }

    public static int findMax(int[][] m) {
        int maxim = m[0][0];
        // trova il valore massimo nella matrice
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maxim) {
                    maxim = m[i][j];  }}}
        return maxim;  }}
