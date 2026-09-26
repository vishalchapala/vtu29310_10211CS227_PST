import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        Map<Integer, Integer> freq = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

    
            deque.addLast(arr[i]);
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            if (deque.size() > k) {
                int removed = deque.removeFirst();

                freq.put(removed, freq.get(removed) - 1);

                if (freq.get(removed) == 0) {
                    freq.remove(removed);
                }
            }

            if (deque.size() == k) {
                maxUnique = Math.max(maxUnique, freq.size());
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}

OUTPUT

Input (stdin)
6 3
5 3 5 2 3 2
Expected Output
3
