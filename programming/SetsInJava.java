import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetsInJava {
    public static void main(String[] args) {
        HashSet h= new HashSet<>();
        LinkedHashSet l=new LinkedHashSet<>();
        TreeSet t= new TreeSet<>();

        h.add(45);
        h.add(25);
        h.add("C");

        l.add(45);
        l.add(25);
        l.add("C");

        t.add(45);
        t.add(25);
        t.add(40);
        // t.add("C"); homogeneouse

        System.out.println("HashSet:"+ h);
        System.out.println("LinkedHashSet:"+ l);
        System.out.println("TreeSet:"+ t);
    }
}