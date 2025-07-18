import java.util.*;

public class queue {
    public static void main(String[] args) {

        // ===== PriorityQueue Example =====
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue elements: " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed from PriorityQueue: " + pq.poll());
        }

        System.out.println("===== Array deque as stack =====");


        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("ArrayDeque as Stack: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Popped from ArrayDeque Stack: " + stack.pop());
        }

        System.out.println("===== LinkedList Example =====");


        LinkedList<String> names = new LinkedList<>();
        names.add("Aman");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("LinkedList Names: " + names);

        names.addFirst("Start");
        names.addLast("End");

        System.out.println("Updated LinkedList Names: " + names);
    }
}
