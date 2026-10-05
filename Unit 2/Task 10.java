import java.util.*;

class Main {
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "geeks";

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }

            if (j == m)
                System.out.print(i + " ");
        }
    }
}

OUTPUT

0 9 12 
