package dijkstra;

import dijkstra.graph.utils.DefaultGraphUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	try (Scanner scanner = new Scanner(System.in)) {
    		DefaultGraph graph = new DefaultGraph();
    		
			System.out.println("Qual seu ponto de partida? (De A até P)");
			String start = scanner.nextLine();
			
			System.out.println("Qual seu ponto de chegada? (De A até P)");
			String end = scanner.nextLine();

            DefaultGraphUtils.calculateDistanceNodes(start, end, graph);
		}
    }
}
