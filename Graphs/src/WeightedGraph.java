import java.util.*;

public class WeightedGraph<V> extends AbstractGraph<V> {
    /**
     * Construct an empty
     */
    public WeightedGraph() {
    }

    /**
     * Construct a WeightedGraph from vertices and edged in arrays
     */
    public WeightedGraph(V[] vertices, int[][] edges) {
        createWeightedGraph(java.util.Arrays.asList(vertices), edges);
    }

    /**
     * Construct a WeightedGraph from vertices and edges in list
     */
    public WeightedGraph(int[][] edges, int numberOfVertices) {
        List<V> vertices = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++)
            vertices.add((V) (new Integer(i)));
        createWeightedGraph(vertices, edges);
    }

    /**
     * Construct a weightedGraph for vertices 0, 1, 2 and edge list
     */
    public WeightedGraph(List<V> vertices, List<WeightedEdge> edge) {
        createWeightedGraph(vertices, edges);
    }

    /**
     * Construct a WeightedGraph from vertices 0, 1, and edge array
     */
    public WeightedGraph(List<WeighedEdge> edges, int numberOfVertices) {
        List<V> vertices = new ArrayList<>();
        for (int i = 0; i < numberOfVertices; i++)
            vertices.add((V) (new Integer(i)));
        createWeightedGraph(vertices,edges);
    }

    /**
     * Create adjacency lists from edge arrays
     */
    private void createWeightedGraph(List<V> vertices, int[][] edges) {
        this.vertices = vertices;

        for (int i = 0; i < vertices.size(); i++) {
            neighbors.add(new ArrayList<Edge>()); // Create a list for vertices
        }
        for (int i = 0; i < edges.length; i++) {
            neighbors.get(edges[i][0]).add(
                    new WeightedEdge(edges[i][0], edges[i][1], edges[i][2]));
        }
    }


    /**
     * Create adjacency lists from edge lists
     */
    private void createWeightedGraph(
            List<V> vertices, List<WeightedEdge> edges) {
        this.vertices = vertices;
        for (int i = 0; i < vertices.size(); i++) {
            neighbors.add(new ArrayList<Edge>()); // Create a list for vertices
        }
        for (WeightedEdge edge : edges) {
            neighbors.get(edge.u).add(edge); // Add an edge into the list
        }
    }
}


