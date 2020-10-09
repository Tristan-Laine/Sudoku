package com.company;

public class Story6 {


    public static void backtracing(int[][] Tableau) {

        for (int Colonne = 0; Colonne < 9; Colonne ++) {
            for (int Ligne = 0; Ligne < 9; Ligne++) {
                for (int nb = 1; nb < 9; nb++) {
                    if (Tableau[Colonne][Ligne] == 0) {
                        Tableau[Colonne][Ligne] = nb;
                        if //valide
                            backtracing();
                        else {
                            Tableau[Colonne][Ligne] = 0;
                        }

                    }
                }
            }
        }
        return false;
    }




    public static void main(String[] args) {

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



    }
}
