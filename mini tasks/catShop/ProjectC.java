import java.util.ArrayList;

public class ProjectC {
    public static ArrayList<Cat> catList = new ArrayList<>();

    public static void main(String[] args) {
        Cat cat1 = new Cat("Kittu", "White-brown", 3.2, 36);
        Cat cat2 = new Cat("Billy", "White-Black", 1.8, 8);
        Cat cat3 = new Cat("Yoda", "White", 1.2, 3);
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        System.out.println();
        System.out.println("===== Welcome to The PET CAT house =====");
        Main.menu();
    }
}
