import java.util.HashMap;
import java.util.Scanner;

public class StudentMarksHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> marks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter roll number and mark: ");
            int roll = sc.nextInt();
            int mark = sc.nextInt();
            marks.put(roll, mark);
        }

        System.out.print("Enter number of searches: ");
        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            System.out.print("Enter roll number to search: ");
            int roll = sc.nextInt();
            if (marks.containsKey(roll)) {
                System.out.println("Roll " + roll + " scored " + marks.get(roll));
            } else {
                System.out.println("Roll " + roll + " not found.");
            }
        }
    }
}
```

OUTPUT:
```text
Enter number of students: 4
Enter roll number and mark: 101 85
Enter roll number and mark: 102 72
Enter roll number and mark: 103 90
Enter roll number and mark: 104 66
Enter number of searches: 3
Enter roll number to search: 103
Roll 103 scored 90
Enter roll number to search: 105
Roll 105 not found.
Enter roll number to search: 101
Roll 101 scored 85
