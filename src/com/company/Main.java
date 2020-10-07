package com.company;

public class Main {

    /**
     * Fonction qui affiche le tableau
     * @param Tableau
     */

    public static void TableauAffichage(int [][] Tableau){

        for (int Colonne = 0; Colonne < 9; Colonne ++){
            for (int Ligne = 0; Ligne < 9; Ligne ++){
                System.out.print(" " + Tableau[Colonne][Ligne] + " ");
            }
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
