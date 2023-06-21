package algorithm_2019_029;

import java.util.*;

public class BFSGraph {
    private int V;

    private LinkedList<Integer> adj[];

    public BFSGraph(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void run(int s){
        boolean visited[] = new boolean[V];

        LinkedList<Integer> que = new LinkedList<Integer>();

        visited[s] = true;

        que.add(s);

        while(que.size() !=0){
            s= que.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    que.add(n);
                }
            }
        }
    }

}
