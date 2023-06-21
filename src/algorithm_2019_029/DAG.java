package algorithm_2019_029;
import java.util.Random;

public class DAG {
    static int maxVertex = 20;
    
    public static boolean checkAcyclic(int[][] edge, int ed,
                                       boolean[] check, int v)
    {
        int i;
        boolean value;
        
        if (check[v] == true)
            
            return false;
        
        else {
            
            check[v] = true;
            
            for (i = ed; i >= 0; i--) {
                
                if (edge[i][0] == v)
                    
            return checkAcyclic(edge, ed, check, edge[i][1]);
                
            }
        }
        
        check[v] = false;
        
        if (i == 0)
            return true;
        return true;
    }
    
    public static void generateRandomGraphs(int e)
    {
        
        int i = 0, j = 0, count = 0;
        int[][] edge = new int[e][2];
        boolean[] check = new boolean[21];
        Random rand = new Random();
        
        // Build a connection between two random vertex
        while (i < e) {
            
            edge[i][0] = rand.nextInt(maxVertex) + 1;
            edge[i][1] = rand.nextInt(maxVertex) + 1;
            
            for (j = 1; j <= 20; j++)
                check[j] = false;
            
            if (checkAcyclic(edge, i, check, edge[i][0]) == true)
                
                i++;
            
            // Check for cycle and if found discard this
            // edge and generate random vertex pair again
        }
        
        System.out.println("The Generated Random Graph is :");
        
        // Print the Graph
        for (i = 0; i < maxVertex; i++) {
            
            count = 0;
            System.out.print((i + 1) + " -> { ");
            
            for (j = 0; j < e; j++) {
                
                if (edge[j][0] == i + 1) {
                    System.out.print(edge[j][1] + " ");
                    count++;
                }
                
                else if (edge[j][1] == i + 1) {
                    count++;
                }
                
                else if (j == e - 1 && count == 0)
                    System.out.print("Isolated Vertex!");
            }
            
            System.out.print(" }\n");
        }
    }
    
    public void run(){
        int e = 4;
        
        System.out.println("Enter the number of Edges :"+ e);
  
        generateRandomGraphs(e);
    }
}
