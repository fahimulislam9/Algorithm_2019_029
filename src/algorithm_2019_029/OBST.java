package algorithm_2019_029;
public class OBST {
    static int optCost(int freq[], int i, int j) {
        if (j < i)
            return 0;
        if (j == i)
            return freq[i];

        int fsum = sum(freq, i, j);

        int min = Integer.MAX_VALUE;

        for (int r = i; r <= j; ++r) {
            int cost = optCost(freq, i, r - 1) +
                    optCost(freq, r + 1, j);
            if (cost < min)
                min = cost;
        }

        return min + fsum;
    }

    static int optimalSearchTree(int keys[], int freq[], int n) {
        return optCost(freq, 0, n - 1);
    }

    // A utility function to get sum of array elements
    // freq[i] to freq[j]
    static int sum(int freq[], int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++)
            s += freq[k];
        return s;
    }

    // Driver code
    public void run() {
        int keys[] = { 10, 12, 20 };
        int freq[] = { 34, 8, 50 };
        int n = keys.length;
        System.out.print("Given keys: ");
        for (int keys2 = 0; keys2 < keys.length; keys2++) {
            System.out.print(keys[keys2] + " ");
        }
        System.out.print("\n\nGiven frequencies: ");
        for (int freq2 = 0; freq2 < freq.length; freq2++) {
            System.out.print(freq[freq2] + " ");
        }
        System.out.println("\n\nCost of Optimal BST is " +
                optimalSearchTree(keys, freq, n));
    }

}
