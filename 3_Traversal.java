import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversal {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Aman");
        s.add("Anay");
        s.add("BOB");
        s.add("Crish");


        System.out.println("-----------for each loop---------------");
        //traversal using for -each
        for(String str: s){
            System.out.println(str +"\t"+str.length()+"\t");
        }
        System.out.println("------------------Iterator-------------------");

        //traversal using Iterator-- forwaed traversing
        Iterator<String>itr=s.iterator();
        while (itr.hasNext()){
            String next=itr.next();
            System.out.println(next);
        }
        System.out.println("---------------ListIterator----------------------");
        //  backword traversing  using ListIterator
        ListIterator<String> litr=s.listIterator(s.size());
        while (litr.hasPrevious()){
           String previous= litr.previous();
            System.out.println(previous);
        }
        System.out.println("--------------For each method--------------------");
        //for each method
        s.forEach(str->{//str lambda
            System.out.println(str);
        });
    }
}
