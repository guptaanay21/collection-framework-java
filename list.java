import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class list {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Collection Framework");

        // =======================
        // TYPE-SAFE ARRAYLIST
        // =======================
        ArrayList<String> s = new ArrayList<>();
        s.add("Aman");
        s.add("Anay");
        s.add("BOB");
        s.add("Crish");

        System.out.println("\n--- ArrayList Example ---");
        System.out.println("Names: " + s);
        System.out.println("Second name: " + s.get(1));
        s.remove(2);
        System.out.println("After removal: " + s);
        System.out.println("Contains 'Aman': " + s.contains("Aman"));
        s.set(1, "Bhavesh");
        System.out.println("After setting new value: " + s);

        // =======================
        // UNTYPED LINKEDLIST
        // =======================
        LinkedList<Object> list = new LinkedList<>();
        list.add("Aman");
        list.add(980);
        list.add(66);
        list.add(98.9);
        list.add(true);

        System.out.println("\n--- Untyped LinkedList Example ---");
        System.out.println("Elements: " + list);

        // =======================
        // VECTOR (Type-safe)
        // =======================
        Vector<String> v = new Vector<>();
        v.add("Aman");
        v.add("Bob");
        v.add("Tom");
        v.add("Jack");

        v.remove(2);
        System.out.println("\n--- Vector Example ---");
        System.out.println("Last element: " + v.lastElement());
        System.out.println("Vector elements: " + v);

        // =======================
        // STACK (LIFO)
        // =======================
        Stack<String> stack = new Stack<>();
        stack.push("Aman");
        stack.push("Bob");
        stack.push("Charlie");

        System.out.println("\n--- Stack Example ---");
        System.out.println("Stack: " + stack);
        System.out.println("Top of Stack (peek): " + stack.peek());
        System.out.println("Popped from Stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // =======================
        // LINKEDLIST (Type-safe)
        // =======================
        LinkedList<String> l = new LinkedList<>();
        l.add("Dog");
        l.add("Cat");
        l.addFirst("Rabbit");
        l.addLast("Parrot");

        System.out.println("\n--- LinkedList Example ---");
        System.out.println("LinkedList: " + l);
        System.out.println("First element: " + l.getFirst());
        System.out.println("Last element: " + l.getLast());
        l.remove("Cat");
        System.out.println("After removing 'Cat': " + l);
    }
}
