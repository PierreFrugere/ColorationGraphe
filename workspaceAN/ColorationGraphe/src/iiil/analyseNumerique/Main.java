/*
 * Main.java                                         12 févr. 2018
 * 3IL 2016-2019 groupe 1, pas de droits ni copyright ni copyleft
 */
package iiil.analyseNumerique;

/**
 * TODO commenter les responsabilités de la classe
 * @author william
 *
 */
public class Main {

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
//    public static void main(String[] args) {
//        
//        int NB_SOMMETS = 5;
//        int MIN;
//        int MAX;
//
//        //launch(args);
//
//        // Matrice d'ajacence du graphe
//        int[][] matriceAdjacence = new int [NB_SOMMETS][NB_SOMMETS];
//
//        // Somme des lignes de la matrice
//        int[][] degresMatrice = new int[NB_SOMMETS][2];
//
//        // Init matrice d'adjadence avec que des zéros
//        for (int i = 0; i < NB_SOMMETS; i++) {
//            for (int j = 0; j < NB_SOMMETS; j++) {
//                matriceAdjacence[i][j] = 0;
//            }
//        }
//
//        // Init à 0 de la matrice des degrés
//        for (int i = 0; i < NB_SOMMETS; i++) {
//            degresMatrice[i][0] = i;
//            degresMatrice[i][1] = 0;
//        }
//
//        // Remplissage de la matrice d'adjacence
//        // Sommet A
//        matriceAdjacence[0][1] = 1;
//        matriceAdjacence[0][2] = 1;
//        matriceAdjacence[0][3] = 1;
//        matriceAdjacence[0][4] = 1;
//
//        // Sommet B
//        matriceAdjacence[1][0] = 1;
//        matriceAdjacence[1][2] = 1;
//        matriceAdjacence[1][4] = 1;
//
//        // Sommet C
//        matriceAdjacence[2][0] = 1;
//        matriceAdjacence[2][1] = 1;
//
//        // Sommet H
//        matriceAdjacence[3][0] = 1;
//        matriceAdjacence[3][4] = 1;
//
//        // Sommet S
//        matriceAdjacence[4][0] = 1;
//        matriceAdjacence[4][1] = 1;
//        matriceAdjacence[4][3] = 1;
//
//        // Calcul des degrés de la matrice
//        for (int i = 0; i < NB_SOMMETS; i++) {
//            for (int j = 0; j < NB_SOMMETS; j++) {
//                if (matriceAdjacence[i][j] == 1) {
//                    degresMatrice[i][1] += 1;
//                }
//            }
//        }
//
//        // Affichage des degrés
//        for (int i = 0; i < NB_SOMMETS; i++) {
//            java.lang.System.out.println("degré ligne " + degresMatrice[i][0] + " : " + degresMatrice[i][1] + "\n");
//        }
//        
//        // Tri du tableau des degrès
//        tri(degresMatrice);
//        
//        for (int i = 0; i < NB_SOMMETS; i++) {
//            java.lang.System.out.println("Après tri : degré ligne " + degresMatrice[i][0] + " : " + degresMatrice[i][1] + "\n");
//        }
//        
//    }
    
    /**
     * TODO commenter le rôle de cette méthode
     * @param tableau
     */
    public static void tri(int[][] tableau) {
        int min, max;
        int[] tampon;
        
        for (int i = 0; i < tableau.length - 1; i++) {
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[i][1] < tableau[j][1]) {
                    tampon = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = tampon;
                }
            }
        }
    }
   
}
