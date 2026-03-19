import java.util.Scanner;
import static java.lang.System.out;
/* Result class */
class KMPResult {
    private int[] matchPositions;
    private int matchCount;

    public KMPResult(int[] matchPositions, int matchCount) {
        this.matchPositions = matchPositions;
        this.matchCount = matchCount;
    }

    public int[] getMatchPositions() { return matchPositions; }
    public int getMatchCount() { return matchCount; }
}

/* Logic class */
class KMPMatcher {
    private String text;
    private String pattern;

    public KMPMatcher(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
    }

    private int[] buildLPS() {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0, i = 1;
        lps[0] = 0;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len != 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    public KMPResult match() {
        int n = text.length();
        int m = pattern.length();
        int[] lps = buildLPS();
        int[] positions = new int[n];
        int count = 0, i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
            }
            if (j == m) {
                positions[count++] = i - j;
                j = lps[j - 1];
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return new KMPResult(positions, count);
    }
}

/* Driver class */
public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.print("Enter the text: ");
        String text = sc.nextLine();

        out.print("Enter the pattern: ");
        String pattern = sc.nextLine();

        if (pattern.length() > text.length()) {
            out.println("Pattern longer than text — no match possible.");
            sc.close();
            return;
        }

        KMPMatcher obj = new KMPMatcher(text, pattern);
        KMPResult result = obj.match();

        if (result.getMatchCount() == 0) {
            out.println("Pattern not found in text.");
        } else {
            out.println("Pattern found " + result.getMatchCount() + " time(s) at index/indices:");
            for (int i = 0; i < result.getMatchCount(); i++) {
                out.print(result.getMatchPositions()[i] + " ");
            }
            out.println();
        }

        sc.close();
    }
}