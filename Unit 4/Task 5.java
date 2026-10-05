import java.util.Scanner;

class Node {
    String song;
    Node next;

    Node(String song) {
        this.song = song;
        this.next = null;
    }
}

public class MusicPlaylist {
    static Node head = null;

    static void addSong(String song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void removeSong(String song) {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (head.song.equalsIgnoreCase(song)) {
            head = head.next;
            System.out.println("Removed: " + song);
            return;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.song.equalsIgnoreCase(song)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Song not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Removed: " + song);
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.print("Playlist: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.song);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add song  2. Remove song  3. Display  4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter song name: ");
                addSong(sc.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter song to remove: ");
                removeSong(sc.nextLine());
            } else if (choice == 3) {
                display();
            }
        } while (choice != 4);
        System.out.println("Exiting...");
    }
}
OUTPUT:
```text

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 1
Enter song name: Shape of You

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 1
Enter song name: Perfect

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 1
Enter song name: Believe

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 3
Playlist: Shape of You -> Perfect -> Believe

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 2
Enter song to remove: Perfect
Removed: Perfect

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 3
Playlist: Shape of You -> Believe

1. Add song  2. Remove song  3. Display  4. Exit
Enter choice: 4
Exiting...
