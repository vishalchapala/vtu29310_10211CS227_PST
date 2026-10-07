import java.util.HashMap;
import java.util.Scanner;

public class SparseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            System.out.println(count.getOrDefault(query, 0));
        }
    }
}
```

SAMPLE INPUT:
```text
5
ab
ab
abc
bc
ab
3
ab
abc
xyz
```

OUTPUT:
```text
3
1
0
```
