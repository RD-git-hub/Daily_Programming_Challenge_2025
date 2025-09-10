import java.util.*;

public class ShortestPathUnweighted {
    private int V;
    private List<List<Integer>> adj;

    public ShortestPathUnweighted(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph
    }

    public int shortestPath(int start, int end) {
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    distance[neighbor] = distance[node] + 1;
                    queue.offer(neighbor);

                    if (neighbor == end) return distance[neighbor];
                }
            }
        }
        return -1; // no path
    }

    public static void main(String[] args) {
        ShortestPathUnweighted graph = new ShortestPathUnweighted(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        int start = 0, end = 4;
        System.out.println("Shortest Path Length: " + graph.shortestPath(start, end));
    }
}
