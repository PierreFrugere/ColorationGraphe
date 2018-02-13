/*
 * ColorEdge.java                                         13 févr. 2018
 * 3IL 2016-2019 groupe 1, pas de droits ni copyright ni copyleft
 */
package iiil.analyseNumerique;

import sbarre.graphe.edge.Edge;
import sbarre.graphe.node.Node;

/**
 * TODO commenter les responsabilités de la classe
 * @author william
 *
 */
public class ColorEdge extends Edge<String, ColorNode> {

    /**
     * TODO commenter l'état initial construit
     * @param predecessor
     * @param successor
     * @throws NullPointerException
     */
    public ColorEdge(Node<String> predecessor, Node<String> successor) throws NullPointerException {
        super(predecessor, successor);
        // TODO Auto-generated constructor stub
    }

}
