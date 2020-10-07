package com.company;

public class StoryTrois {

    public static void TableauAffichage(int[][] Tableau) {

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(" " + Tableau[row][column]);
            }
            System.out.println();
        }
    }

    public static boolean ContrainteLigne(int[][] Tableau) {
        boolean nombre = true;
        for (int i = 0; i < 9; i++) {
            for (int nb = i + 1; nb < 9; nb++) {
                if ((Tableau[0][i] == Tableau[0][nb]) && (Tableau[0][i] != 0) && (i != nb)) {
                    int Faux = Tableau[0][i];
                    nombre = false;
                    System.out.println(Faux + " est sur la ligne.");
                }
            }
        }
        return nombre;
    }
    public static boolean ContrainteColonne(int[][] Tableau) {
        boolean nombre=true;
        for(int i=0;i < 9;i++){
            for(int nb=i+1;nb < 9; nb++){
                if((Tableau[i][0] == Tableau[nb][0]) && (Tableau[i][0] !=0) && (i != nb)){
                    int Faux = Tableau[i][0];
                    nombre = false;
                    System.out.println(Faux + " est sur la colonne.");
                }
            }
        }
        System.out.println();
        System.out.println(nombre);
        return nombre;
    }
    public static boolean ContrainteSousSection(int[][] Tableau) {
        boolean nombre = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int nb=1; nb < 9; nb++) {
                    if ((Tableau[j][i] == Tableau[j][nb]) && (Tableau[j][i] != 0) && (i != nb)) {
                        int Faux = Tableau[j][i];
                        nombre = false;
                        System.out.println(Faux + " est dans la sous-section.");
                    }
                }
            }
        }
        System.out.println();
        System.out.println(nombre);
        return nombre;
    }

    public static void main(String[] args) {
        int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {3, 0, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0},
        };
        TableauAffichage(boardEasy);
        //ContrainteLigne(boardEasy);
        //ContrainteColonne(boardEasy);
        ContrainteSousSection(boardEasy);
    }
}