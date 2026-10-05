import java.util.HashSet;
import java.util.Scanner;

public class CommonSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> student1 = new HashSet<>();
        HashSet<String> student2 = new HashSet<>();

        System.out.print("Enter number of subjects of Student 1: ");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.print("Enter subject " + i + ": ");
            student1.add(sc.next());
        }

        System.out.print("Enter number of subjects of Student 2: ");
        int n2 = sc.nextInt();
        for (int i = 1; i <= n2; i++) {
            System.out.print("Enter subject " + i + ": ");
            student2.add(sc.next());
        }

        student1.retainAll(student2);

        System.out.println("Common subjects: " + student1);
    }
}
```

OUTPUT:
```text
Enter number of subjects of Student 1: 4
Enter subject 1: Maths
Enter subject 2: Physics
Enter subject 3: Java
Enter subject 4: Chemistry
Enter number of subjects of Student 2: 4
Enter subject 1: Java
Enter subject 2: Maths
Enter subject 3: Biology
Enter subject 4: English
Common subjects: [Maths, Java]
