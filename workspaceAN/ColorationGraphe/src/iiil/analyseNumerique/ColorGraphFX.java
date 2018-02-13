/*
 * ColorGraphFX.java                                         13 févr. 2018
 * 3IL 2016-2019 groupe 1, pas de droits ni copyright ni copyleft
 */
package iiil.analyseNumerique;

import java.util.ArrayList;
import java.util.Observable;

import graphfx.edge.unoriented.SimpleUnorientedEdgeFX;
import graphfx.edge.unoriented.UnorientedEdgeFX;
import graphfx.graph.unoriented.UnorientedGraphFX;
import graphfx.node.NodeFX;
import graphfx.node.SimpleCircleNodeFX;
import sbarre.graphe.edge.Edge;
import sbarre.graphe.edge.SimpleStringEdge;
import sbarre.graphe.graph.unoriented.UnorientedGraph;
import sbarre.graphe.graph.unoriented.UnorientedSimpleStringGraph;
import sbarre.graphe.node.SimpleStringNode;

/**
 * TODO commenter les responsabilités de la classe
 * @author william
 *
 */
public class ColorGraphFX extends UnorientedGraphFX<String, NodeFX<String>, UnorientedEdgeFX<String, NodeFX<String>>> {

    /**
     * TODO commenter l'état initial construit
     * @param graph
     */
    public ColorGraphFX(ColorGraph graph) {
        super(graph);
        
        dessineGraphe(graph);
    }

    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    @Override
    public void update(Observable arg0, Object arg1) {

        dessineGraphe((ColorGraph) graph);
    }

    /**
     * TODO Documenter le r�le de cette m�thode.
     * 
     * @param graph
     */
    private void dessineGraphe(ColorGraph graph) {

        final ArrayList<ColorNode> sommets = graph.getNodes();
        final ArrayList<SimpleCircleNodeFX> sommetsFX = new ArrayList<>();

        getChildren().clear();

        for (final ColorNode sommet : sommets) {

            final SimpleCircleNodeFX nodefx = new SimpleCircleNodeFX(sommet);
            sommetsFX.add(nodefx);
            getChildren().add(nodefx);
        }

        final ArrayList<ColorEdge> edges = graph.getEdges();

        for (final ColorEdge edge : edges) {

            final SimpleUnorientedEdgeFX edgefx = new SimpleUnorientedEdgeFX(
                    sommetsFX.get(sommets.indexOf(edge.getPredecessor())),
                    sommetsFX.get(sommets.indexOf(edge.getSuccessor())));
            getChildren().add(0, edgefx);
        }
    }

}
