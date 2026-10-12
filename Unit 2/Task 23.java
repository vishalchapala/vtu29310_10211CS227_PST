
import java.io.*;

class Result {

    public static String twoStrings(String s1, String s2) {

        boolean[] seen = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            seen[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (seen[s2.charAt(i) - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {

            String s1 = bufferedReader.readLine().trim();
            String s2 = bufferedReader.readLine().trim();

            String result = Result.twoStrings(s1, s2);

            bufferedWriter.write(result);
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
hello
world
hi
world
Your Output (stdout)
YES
NO
