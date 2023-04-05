package dijkstra;

import java.util.List;
import java.util.Scanner;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;

public class Main {
    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
    		DefaultGraph graph = new DefaultGraph();
    		
			System.out.println("Qual seu ponto de partida? (De A até P)");
			String start = scanner.nextLine();
			
			System.out.println("Qual seu ponto de chegada? (De A até P)");
			String end = scanner.nextLine();
			
     
			calculate(start, end, graph);
		}
    }
    
    private static void calculate(String start, String end, DefaultGraph graph) {
    	DijkstraShortestPath<String, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph.getDefaultGraph());
        double shortestDistance = dijkstra.getPathWeight(start.toUpperCase(), end.toUpperCase());
       
        
        List<DefaultWeightedEdge> shortestPath = dijkstra.getPath(start.toUpperCase(), end.toUpperCase()).getEdgeList();
        
        System.out.println(" ======== Indo de " + start.toUpperCase() + " até " + end.toUpperCase() + " ======== ");
        
        System.out.println("Menor caminho: " + shortestPath);
        System.out.println("Distância: " + shortestDistance);
    }
}
