package algorithm_2019_029;

public class KnapSack {
    public void runKnapSack() {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.print("Weights are: [ ");
        for (int w : weight) {
            System.out.print(w+" ");
        }
        System.out.print("]\n");
        System.out.print("Profits are: [ ");
        for (int p : profit) {
            System.out.print(p+" ");
        }
        System.out.print("]\n");

        System.out.println("Weight of the sack is: "+W);
        System.out.println("Knapsack output: "+knapSack(W, weight, profit, n));
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);

        else
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
    }
}
