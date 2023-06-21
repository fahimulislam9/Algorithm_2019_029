package algorithm_2019_029;

import java.util.LinkedList;
import java.util.Queue;

public class MinCut {
    private static boolean bfs(int[][] rGraph, int s, int t, int[] parent) {

        boolean[] visited = new boolean[rGraph.length];

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i = 0; i < rGraph.length; i++) {
                if (rGraph[v][i] > 0 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                    parent[i] = v;
                }
            }
        }
        return (visited[t] == true);
    }

    private static void dfs(int[][] rGraph, int s,
            boolean[] visited) {
        visited[s] = true;
        for (int i = 0; i < rGraph.length; i++) {
            if (rGraph[s][i] > 0 && !visited[i]) {
                dfs(rGraph, i, visited);
            }
        }
    }

    private static void minCut(int[][] graph, int source, int t) {
        int u, v;

        int[][] rGraph = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                rGraph[i][j] = graph[i][j];
            }
        }

        int[] parent = new int[graph.length];

        while (bfs(rGraph, source, t, parent)) {

            int pathFlow = Integer.MAX_VALUE;
            for (v = t; v != source; v = parent[v]) {
                u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }

            for (v = t; v != source; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] = rGraph[u][v] - pathFlow;
                rGraph[v][u] = rGraph[v][u] + pathFlow;
            }
        }

        boolean[] isVisited = new boolean[graph.length];
        dfs(rGraph, source, isVisited);

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] > 0 && isVisited[i] && !isVisited[j]) {
                    System.out.println(i + " - " + j);
                }
            }
        }
    }

    public void run(int[][] graph, int source, int t) {
    
        minCut(graph, source, t);
    }
}
