import java.util.ArrayList;
import java.util.Collections;

// Comparable is an interface used to comapare objects or object members
// CompareTo() method is Overridden to perform spaacific comparisions for objects
class Emp implements Comparable<Emp> {
    int id;
    int sal;

    Emp(int id, int sal) {
        this.id = id;
        this.sal = sal;
    }

    // Overriding toString() to print id n sal instead of address
    @Override
    public String toString() {
        return this.id + " " + this.sal;
    }

    // Overriding compareTo() in Comparable interface
    // comparing specific values in class instance with other class instance
    // this method is also present in Collections.sort() to sort Lists
    @Override
    public int compareTo(Emp e) {
        // return negative if current object value is smaller (already ascending)
        if (this.sal < e.sal) {
            return -1;
        }
        // return 0 if no swap is required or values are equal
        else if (this.sal == e.sal) {
            if (this.id < e.id) {
                return -1;
            } else {
                return 1;
            }
        }
        // return positive if other object value is smaller (Swap required)
        else {
            return 1;
        }
    }
}

public class ComparableInterface {
    public static void main(String[] args) {

        ArrayList<Emp> a = new ArrayList<>();
        a.add(new Emp(4, 100));
        a.add(new Emp(3, 200));
        a.add(new Emp(2, 200));
        a.add(new Emp(1, 100));

        // sort() calls compareTo() to compare object or object value of the list
        // and sorts the list
        Collections.sort(a);
        System.out.println(a);

    }

}
