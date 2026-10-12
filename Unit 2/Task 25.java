
import java.io.*;

class Result {

    public static int marsExploration(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char expected;

            if (i % 3 == 1) {
                expected = 'O';
            } else {
                expected = 'S';
            }

            if (s.charAt(i) != expected) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine().trim();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}


OUTPUT

Input (stdin)
SOSSPSSQSSOR
Your Output (stdout)
3
