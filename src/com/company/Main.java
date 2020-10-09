



        package com.company;
        import java.util.concurrent.TimeUnit;



        public class Main {
                private static void calculation() throws InterruptedException {

                        //Sleep 2 seconds
                        TimeUnit.SECONDS.sleep(2);

                }


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
    public static boolean ContraintesLigneTOUT(int [][] Tableau){
        boolean Nombre = true;

        for (int j=0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                for (int nb = i + 1; nb < 9; nb++) {
                    if ((Tableau[j][i] == Tableau[j][nb]) && (Tableau[j][i] != 0) && (i != nb)) {
                        int FAUX = Tableau[j][i];
                        Nombre = false;
                        System.out.print(FAUX + " est déjà sur la ligne. ");
                    }
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

        for (int j=0; j < 9; j++) {
            for (int nb = j+1; nb < 9; nb++) {
                if ((Tableau[j][0] == Tableau[nb][0]) && (Tableau[j][0] != 0) && (j != nb)) {
                    int FAUX = Tableau[j][0];
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


        public static void main(String[] args) throws InterruptedException {
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
                long lStartTime = System.currentTimeMillis();
        TableauAffichage(boardEasy);
        ContraintesLigne(boardEasy);
        ContraintesColonne(boardEasy);
        ContrainteSOUSsection(boardEasy);






                        //calculation();

                        long lEndTime = System.currentTimeMillis();

                        long output = lEndTime - lStartTime;

                        System.out.println("Elapsed time in milliseconds: " + output);

                }

        }




    }
    public static boolean ContraintesColonneTOUT(int [][] Tableau){
        boolean Nombre = true;
        for (int i=0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int nb = j + 1; nb < 9; nb++) {
                    if ((Tableau[j][i] == Tableau[nb][i]) && (Tableau[j][i] != 0) && (j != nb)) {
                        int FAUX = Tableau[j][i];
                        Nombre = false;
                        System.out.print(FAUX + " est déjà sur la colonne. ");
                    }
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

                for (int i = 0 ; i < 9; i = i + 3) {
                    for (int j = 0 ; j < 9; j = j + 3) {
                        for (int n = 0; n < 3; n++) {
                            for (int nb = 0; nb < 3; nb++) {
                                if ((Tableau[j][i] == Tableau[n][nb]) && (Tableau[j][i] != 0) && ((j != n) && (i != nb))){
                                    int Faux = Tableau[j][i];
                                    nombre = false;
                                    System.out.print(Faux + " est déjà dans la sous section.");
                                }
                            }
                        }
                    }
                }
        System.out.println();
        System.out.println(nombre);
        return nombre;
    }

    public static boolean ContrainteSOUSsectionTOUT(int[][] Tableau) {
        boolean nombre=true;
        for (int jj = 0; jj < 7; jj = jj + 3){
            for (int ii = 0; ii < 7; ii = ii + 3) {
                for  (int j = jj; j < 3 + jj; j++){
                    for  (int i = ii; i < 3 + ii; i++){
                        for (int n = jj; n < 3 + jj; n++) {
                            for (int nb = ii; nb < 3 + ii; nb++) {
                                if ((Tableau[j][i] == Tableau[n][nb]) && (Tableau[j][i] != 0) && ((j != n) && (i != nb))) {
                                    int Faux = Tableau[j][i];
                                    nombre = false;
                                    System.out.print(Faux + " est déjà dans la sous section. ");
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println(nombre);
        return nombre;
    }

        public static void main(String[] args) {
	// write your code here
            int[][] boardEasy = {
                    {4, 0, 0, 1, 0, 2, 6, 8, 4},
                    {1, 1, 0, 0, 9, 0, 0, 0, 4},
                    {0, 3, 8, 0, 6, 4, 0, 1, 0},
                    {4, 0, 5, 0, 7, 1, 9, 2, 0},
                    {0, 2, 6, 0, 0, 9, 8, 0, 0},
                    {8, 0, 0, 2, 5, 0, 0, 0, 0},
                    {9, 0, 3, 2, 0, 2, 0, 0, 8},
                    {2, 5, 0, 6, 0, 0, 1, 0, 7},
                    {6, 0, 7, 9, 0, 5, 3, 0, 5}
            };

    TableauAffichage(boardEasy);
  //ContraintesLigne(boardEasy);
   //ContraintesLigneTOUT(boardEasy);

   //ContraintesColonne(boardEasy);
     //ContraintesColonneTOUT(boardEasy);

    //ContrainteSOUSsection(boardEasy);
    //ContrainteSOUSsectionTOUT(boardEasy);

    }
}

