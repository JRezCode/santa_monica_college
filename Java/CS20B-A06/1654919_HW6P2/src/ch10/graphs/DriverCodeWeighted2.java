package ch10.graphs;

public class DriverCodeWeighted2 {

	public static void main(String[] args) {

		WeightedGraph2<String> graph = new WeightedGraph2<String>();
		String a = "HELLO";
		String b = "GRAPH";
		String c = "TREE";
		graph.addVertex(a);
		graph.addVertex(b);
		graph.addVertex(c);
		graph.addVertex("OBJECT");
		graph.addVertex("APPLICATION");
		graph.addVertex("FUN");
		graph.addEdge("HELLO", "APPLICATION", 10);
		graph.addEdge("HELLO", "TREE", 10);
		graph.addEdge("HELLO", "OBJECT", 10);
		graph.addEdge("GRAPH", "APPLICATION", 10);
		graph.addEdge("GRAPH", "TREE", 10);
		graph.addEdge("GRAPH", "FUN", 100);
		graph.addEdge("TREE", "OBJECT", 10);
		graph.addEdge("TREE", "APPLICATION", 10);
		graph.addEdge("APPLICATION", "GRAPH", 10);
		graph.addEdge("TREE", "HELLO", 10);

		System.out.println("Vertex and Edge Counts");
		System.out.println("Vertex:" + a + "\t\tEdges (true if 3): " + graph.countEdges(a));
		System.out.println("Vertex:" + b + "\t\tEdges (true if 3): " + graph.countEdges(b));
		System.out.println("Vertex:" + "APPLICATION" + "\tEdges (true if 1): " + graph.countEdges("APPLICATION"));
		System.out.println();
		System.out.println("Common connection among nodes, V1 = \"HELLO\" and V2 = \"GRAPH\"");
		System.out.println(graph.commonConnections(graph.getToVertices("HELLO"),graph.getToVertices("GRAPH")));
	}
}
