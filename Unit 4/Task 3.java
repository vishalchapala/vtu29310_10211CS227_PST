
import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        System.out.print("Enter number of pages visited: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter page " + i + ": ");
            history.push(sc.nextLine());
        }

        System.out.println("Current page: " + history.peek());

        System.out.print("Enter number of times Back is pressed: ");
        int back = sc.nextInt();

        for (int i = 0; i < back; i++) {
            if (history.isEmpty()) {
                System.out.println("No more pages in history.");
                break;
            }
            System.out.println("Back pressed. Removed page: " + history.pop());
        }

        if (history.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("Now on page: " + history.peek());
        }
    }
}
```

OUTPUT:
```text
Enter number of pages visited: 4
Enter page 1: google.com
Enter page 2: youtube.com
Enter page 3: github.com
Enter page 4: stackoverflow.com
Current page: stackoverflow.com
Enter number of times Back is pressed: 2
Back pressed. Removed page: stackoverflow.com
Back pressed. Removed page: github.com
Now on page: youtube.com
```
