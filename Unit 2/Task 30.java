
import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> circularPalindromes(String s) {
        int n = s.length();
        String doubled = s + s;

        int[] odd = new int[2 * n];
        int[] even = new int[2 * n];

        int l = 0;
        int r = -1;

        // Manacher's algorithm for odd-length palindromes
        for (int i = 0; i < 2 * n; i++) {
            int k = (i > r) ? 1 :
                    Math.min(odd[l + r - i], r - i + 1);

            while (i - k >= 0 && i + k < 2 * n &&
                   doubled.charAt(i - k) == doubled.charAt(i + k)) {
                k++;
            }

            odd[i] = k;

            if (i + k - 1 > r) {
                l = i - k + 1;
                r = i + k - 1;
            }
        }

        l = 0;
        r = -1;

        // Manacher's algorithm for even-length palindromes
        for (int i = 0; i < 2 * n; i++) {
            int k = (i > r) ? 0 :
                    Math.min(even[l + r - i + 1], r - i + 1);

            while (i - k - 1 >= 0 && i + k < 2 * n &&
                   doubled.charAt(i - k - 1) == doubled.charAt(i + k)) {
                k++;
            }

            even[i] = k;

            if (i + k - 1 > r) {
                l = i - k;
                r = i + k - 1;
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Calculate the longest palindrome for each rotation
        for (int start = 0; start < n; start++) {
            int best = 1;

            for (int center = start; center < start + n; center++) {
                int oddLen = Math.min(2 * odd[center] - 1, n);
                int evenLen = Math.min(2 * even[center], n);

                best = Math.max(best, Math.max(oddLen, evenLen));
            }

            ans.add(best);
        }

        return ans;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine().trim();

        List<Integer> result = Result.circularPalindromes(s);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}


OUTPUT

Input (stdin)
7
cacbbba
Your Output (stdout)
3
3
3
3
3
3
3
