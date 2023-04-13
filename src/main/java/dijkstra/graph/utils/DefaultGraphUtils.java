package dijkstra.graph.utils;

import dijkstra.DefaultGraph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

import java.util.List;

public class DefaultGraphUtils {
    public static void calculateDistanceNodes(String start, String end, DefaultGraph graph) {
        DijkstraShortestPath<String, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph.getDefaultGraph());
        double shortestDistance = dijkstra.getPathWeight(start.toUpperCase(), end.toUpperCase());


        List<DefaultWeightedEdge> shortestPath = dijkstra.getPath(start.toUpperCase(), end.toUpperCase()).getEdgeList();

        System.out.println(" ======== Indo de " + start.toUpperCase() + " até " + end.toUpperCase() + " ======== ");

        System.out.println("Menor caminho: " + shortestPath);
        System.out.println("Distância: " + shortestDistance);
    }
}
