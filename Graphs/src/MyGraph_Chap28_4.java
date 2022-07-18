import java.util.*;

public class MyGraph_Chap28_4<V> extends UnweightedGraph<V> {
    /** Construct an empty graph */
    public MyGraph_Chap28_4() {
    }

    /** Construct a graph from edges and vertices stored in arrays */
    public MyGraph_Chap28_4(int[][] edges, V[] vertices) {
        super(vertices, edges);
    }

    /** Construct a graph from edges and vertices stored in List */
    public MyGraph_Chap28_4(List<V> vertices, List<Edge> edges) {
        super(vertices, edges);
    }

    /** Construct a graph for integer vertices 0, 1, 2 and edge list */
    public MyGraph_Chap28_4(List<Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    /** Construct a graph from integer vertices 0, 1, and edge array */
    public MyGraph_Chap28_4(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    public List<List<Integer>> getConnectedComponents() {
        List<List<Integer>> list = new ArrayList<List<Integer>>();  // create the ArrayList holder

        List<Integer> vertexIndices = new ArrayList<Integer>();  // Create a list of all possible indices
        for (int i = 0; i < vertices.size(); i++)
            vertexIndices.add(i);

        while (vertexIndices.size() > 0) {
            Tree tree = dfs(vertexIndices.get(0));          //  create a tree from the first indice
            list.add(tree.getSearchOrder());                //  add it to the list
            vertexIndices.removeAll(tree.getSearchOrder()); //  remove all verices that match/are in the tree
        }                                                 //    thus eliminating any duplicate dfs tree sets.

        return list;
    }
} // MyGraph_Chap28_4

