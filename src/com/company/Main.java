package com.company;

public class Main {


    public static void TableauAffichage(int [][] Tableau){

        for (int Colonne = 0; Colonne < 9; Colonne ++){
            for (int Ligne = 0; Ligne < 9; Ligne ++){
                System.out.print(" " + Tableau[Colonne][Ligne] + " ");
            }
            System.out.println();
        }
    }

    public static boolean ContraintesLigne(int [][] Tableau){
        boolean Nombre = true;

        for (int i=0; i < 9; i++) {
            for (int nb = i+1; nb < 9; nb++) {
                if ((Tableau[0][i] == Tableau[0][nb]) && (Tableau[0][i] != 0) && (i != nb)) {
                    int FAUX = Tableau[0][i];
                    Nombre = false;
                    System.out.print(FAUX + " est déjà sur la ligne. ");
                }
            }
        }
        System.out.println();
        System.out.println(Nombre);
        System.out.println();
        return Nombre;
    }








    public static boolean ContraintesColonne(int [][] Tableau){
        boolean Nombre = true;

        for (int i=0; i < 9; i++) {
            for (int nb = i+1; nb < 9; nb++) {
                if ((Tableau[i][0] == Tableau[nb][0]) && (Tableau[i][0] != 0) && (i != nb)) {
                    int FAUX = Tableau[i][0];
                    Nombre = false;
                    System.out.print(FAUX + " est déjà sur la colonne. ");
                }
            }
        }
        System.out.println();
        System.out.println(Nombre);
        System.out.println();
        return Nombre;
    }


    public static boolean ContrainteSOUSsection(int[][] Tableau) {
        boolean nombre=true;

                for (int i = 0 ; i < 3; i++) {
                    for (int j = 0 ; j < 3; j++) {
                        for (int nb = 1; nb < 9; nb++) {
                            if ((Tableau[j][i] == Tableau[j][nb]) && (Tableau[j][i] != 0) && (i != nb)) {
                                int Faux = Tableau[j][i];
                                nombre = false;
                                System.out.print(Faux + " est déjà sur dans la sous section.");
                            }
                        }
                        System.out.println(nombre);
                    }
                }
        System.out.println();
        System.out.println(nombre);
        return nombre;
    }


    public static void main(String[] args) {
	// write your code here

                int[][] boardEasy = {
                {4, 0, 0, 1, 2, 2, 6, 8, 0},
                {1, 0, 4, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {8, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
                };

    TableauAffichage(boardEasy);
    ContraintesLigne(boardEasy);
    ContraintesColonne(boardEasy);
    ContrainteSOUSsection(boardEasy);

    }
}
