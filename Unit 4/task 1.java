import java.util.*;

public class CollectionProblem {

    public static void main(String[] args) {

        // Linear collection
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(30);

        // Non-linear collection
        HashSet<Integer> seen = new HashSet<>();

        // TreeSet stores elements in sorted order
        TreeSet<Integer> duplicates = new TreeSet<>();

        for (int number : numbers) {

            // If number already exists, it is a duplicate
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Original numbers:");
        System.out.println(numbers);

        System.out.println("Duplicate numbers:");
        System.out.println(duplicates);
    }
}



Original numbers:
[10, 20, 30, 20, 40, 10, 50, 30]

Duplicate numbers:
[10, 20, 30]
