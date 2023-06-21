package algorithm_2019_029;

public class StringMatching {
    private void search(String pat, String txt) {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;

        for (i = 0, j = l2 - 1; j < l1;) {
            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index " + i);
            }
            i++;
            j++;
        }
    }

    public void run(String pat, String txt) {
        search(pat, txt);
    }
}
