package com.company;

public class Main {

    /**
     * Fonction qui affiche le tableau
     * @param Tableau
     */

    public static void TableauAffichage(int [][] Tableau){
        int Ligne = 0;
        int Colonne = 0;

        while (Colonne < 9){
            while (Ligne < 9){
                System.out.print(" " + Tableau[Colonne][Ligne] + " ");
                Ligne = Ligne + 1;
            }
            Ligne = 0;
            Colonne = Colonne + 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here

                int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
                };

    TableauAffichage(boardEasy);


    }
}
