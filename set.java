    import java.util.HashSet;
    import java.util.TreeSet;

    public class set {
    public static void main(String[] args) {

        // ============================
        // HashSet with Double (Type-Safe)
        // ============================
        HashSet<Double> nms = new HashSet<>();

        nms.add(23.77);
        nms.add(99.77);
        nms.add(2.77);
        nms.add(77.77);
        nms.add(77.77); // Duplicate – will be ignored

        System.out.println("--- HashSet of Double ---");
        System.out.println("Size of set: " + nms.size());
        System.out.println("Elements: " + nms);

        // ============================
        // HashSet with String
        // ============================
        HashSet<String> H = new HashSet<>();

        H.add("Bob");
        H.add("David");
        H.add("Aman");
        H.add("Anay");

        System.out.println("\n--- HashSet of String ---");
        System.out.println("Contains 'Bob': " + H.contains("Bob"));
        System.out.println("Contains 'David': " + H.contains("David"));

        H.remove("Bob");
        System.out.println("After removing 'Bob': " + H);

        // ============================
        // TreeSet with String
        // ============================
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("jerry");
        treeSet.add("Anuj");
        treeSet.add("Charlie");
        treeSet.add("mick");
        treeSet.add("Anuj"); // Duplicate – will be ignored

        System.out.println("\n--- TreeSet of String ---");
        System.out.println("TreeSet: " + treeSet);

        System.out.println("Size: " + treeSet.size());

        System.out.println("Contains 'Charlie': " + treeSet.contains("Charlie"));

        // first(), last() – get first and last elements in sorted order
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        treeSet.remove("Bob");
        System.out.println("After removing 'Bob': " + treeSet);

        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        treeSet.clear();
        System.out.println("After clearing: " + treeSet);
    }
}
