/*
 * Lanceur.java                                         13 févr. 2018
 * 3IL 2016-2019 groupe 1, pas de droits ni copyright ni copyleft
 */
package iiil.analyseNumerique;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * TODO commenter les responsabilités de la classe
 * @author william
 *
 */
public class Lanceur extends Application {

    /**
     * TODO commenter le rôle de cette méthode
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        ColorGraph graphe = new ColorGraph();
        
        ColorNode nodeA = new ColorNode("A");
        ColorNode nodeB = new ColorNode("B");
        
        graphe.addNode(nodeA);
        graphe.addNode(nodeB);
        
        ColorEdge edgeAB = new ColorEdge(nodeA, nodeB);
        graphe.addEdge(edgeAB);
        
        ColorGraphFX unorientedGraph = new ColorGraphFX(graphe);
        
        Scene scene = new Scene(unorientedGraph);
        
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }

}
