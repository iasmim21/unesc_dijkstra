package dijkstra;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedPseudograph;

import java.util.Arrays;
import java.util.List;

public class DefaultGraph {
	private WeightedPseudograph<String, DefaultWeightedEdge> graph;
	public DefaultGraph() {
		graph = new WeightedPseudograph<>(DefaultWeightedEdge.class);

		generateStandardGraph();
    }

	public WeightedPseudograph<String, DefaultWeightedEdge> getDefaultGraph() {
		return graph;
	}

	private void generateStandardGraph() {
		getVerticeValues().forEach(graph::addVertex);

		String[][] edges = getEdgeValues();

		for (int i = 0; i < edges.length; i++) {
			DefaultWeightedEdge edge = graph.addEdge(edges[i][0], edges[i][1]);
			graph.setEdgeWeight(edge, Integer.parseInt(edges[i][2]));
		}
	}

	private String[][] getEdgeValues() {
		return new String[][] {
				{"A", "C", "1"},
				{"C", "E", "5"},
				{"E", "H", "2"},
				{"L", "O", "5"},
				{"O", "B", "2"},
				{"A", "D", "0"},
				{"D", "G", "3"},
				{"G", "K", "4"},
				{"K", "N", "2"},
				{"N", "P", "4"},
				{"P", "B", "1"},
				{"D", "F", "1"},
				{"F", "I", "1"},
				{"I", "L", "3"},
				{"G", "J", "5"},
				{"J", "M", "2"},
				{"M", "O", "2"},
				{"C", "F", "4"},
				{"F", "J", "2"},
				{"J", "N", "2"},
				{"E", "I", "1"},
				{"I", "M", "4"},
				{"M", "P", "8"},
		};
	}

	private List<String> getVerticeValues() {
		return Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P");
	}
}
