
import java.io.*;

class Result {

    public static long stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];

        int left = 0;
        int right = 0;
        long sum = n;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while (i + z[i] < n &&
                   s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }

            sum += z[i];
        }

        return sum;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine().trim();

            long result = Result.stringSimilarity(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}


OUTPUT

Input (stdin)
2
ababaa
aa
Your Output (stdout)
11
3
