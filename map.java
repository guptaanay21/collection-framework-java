import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {
    public static void main(String[] args){

        // ============================
        // HashMap with String, Integer
        // ============================
        HashMap<String, Integer> course = new HashMap<>();
        course.put("core java", 4000);
        course.put("python", 6000);
        course.put("DSA", 10000);
        course.put("SQL", 2000);
        course.put("Android", 7000);

        System.out.println("HashMap (Random Order):");
        System.out.println(course);
        course.forEach((e1, e2) -> {
            System.out.println(e1 + " => " + e2);
        });

        // ============================
        // LinkedHashMap with String, Integer
        // ============================
        LinkedHashMap<String, Integer> name = new LinkedHashMap<>();
        name.put("Aman", 21);
        name.put("bob", 22);
        name.put("tom", 20);
        name.put("anay", 24);

        System.out.println("\nLinkedHashMap (Insertion Order):");
        System.out.println(name);
        name.forEach((e1, e2) -> {
            System.out.println(e1 + " => " + e2);
        });

        // ============================
        // TreeMap with String, String
        // ============================
        TreeMap<String, String> teach = new TreeMap<>();
        teach.put("Rahul", "science");
        teach.put("manoj", "maths");
        teach.put("avdesh", "english");
        teach.put("anuj", "geography");

        System.out.println("\nTreeMap (Sorted by Keys):");
        System.out.println(teach);
        teach.forEach((e1, e2) -> {
            System.out.println(e1 + " => " + e2);
        });
    }
}
