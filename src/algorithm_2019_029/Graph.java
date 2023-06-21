package algorithm_2019_029;

import java.util.*;

public class Graph {
    private LinkedList<Integer> adjLists[];
    // private boolean visited[];

    // Graph creation
    Graph(int vertices) {
        adjLists = new LinkedList[vertices];
        // visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src);
    }

    LinkedList<Integer>[] getList(){
        return adjLists;
    }

    // private LinkedList<Integer> adj[];

    // void addEdge(int src, int dest) {
    // adj[src].add(dest);
    // }

    // public void createUndirectedGraph(int v){
    // adj = new LinkedList[v];

    // for (int i = 0; i < v; i++)
    // adj[i] = new LinkedList<Integer>();

    // }

    // public LinkedList<Integer>[] getList(){
    // return adj;
    // }

}
