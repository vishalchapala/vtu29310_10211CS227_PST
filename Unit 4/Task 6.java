import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> items = new LinkedHashSet<>();

        System.out.print("Enter number of items purchased: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter item " + i + ": ");
            items.add(sc.next());
        }

        System.out.println("Unique items in purchase order: " + items);
    }
}
```

OUTPUT:
```text
Enter number of items purchased: 7
Enter item 1: milk
Enter item 2: bread
Enter item 3: milk
Enter item 4: eggs
Enter item 5: bread
Enter item 6: rice
Enter item 7: eggs
Unique items in purchase order: [milk, bread, eggs, rice]
