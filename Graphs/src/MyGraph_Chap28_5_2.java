
import java.util.*;

public class MyGraph_Chap28_5_2<V> extends UnweightedGraph<V> {
    /** Construct an empty graph */
    public MyGraph_Chap28_5_2() {
    }

    /** Construct a graph from edges and vertices stored in arrays */
    public MyGraph_Chap28_5_2(int[][] edges, V[] vertices) {
        super(vertices, edges);
    }

    /** Construct a graph from edges and vertices stored in List */
    public MyGraph_Chap28_5_2(List<V> vertices, List<Edge> edges) {
        super(vertices, edges);
    }

    /** Construct a graph for integer vertices 0, 1, 2 and edge list */
    public MyGraph_Chap28_5_2(List<Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    /** Construct a graph from integer vertices 0, 1, and edge array */
    public MyGraph_Chap28_5_2(int[][] edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }

    public Tree getPathUtoV(int u, int endV) {
        return dfsUtoV(u,endV);
    }

    public Tree dfsUtoV(int u,int endV) {
        List<Integer> searchOrder = new ArrayList<>();
        int[] parent = new int[vertices.size()];
        for (int i = 0; i < parent.length; i++)
            parent[i] = -1; // Initialize parent[i] to -1

        // Mark visited vertices
        boolean[] isVisited = new boolean[vertices.size()];

        // Recursively search
        //boolean dfsUtoVFound = dfsUtoV(u,endV, parent, searchOrder, isVisited);

        // Return a search tree
        //if (dfsUtoVFound)
          //  return new Tree(u, parent, searchOrder);

        return null;  // No path found
    }

    /* Recursive method for DFS search */
    /*private boolean dfsUtoV(int u, int endV,int[] parent, List<Integer> searchOrder, boolean[] isVisited)
    {
        if()
        {
            parent[] = ;
            searchOrder.add();
            isVisited[] = true;
        }
        return true;
    }*/ // dfsUtoV

} // MyGraph_Chap28_5