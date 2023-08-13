import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println();
        System.out.println("1. See cat details");
        System.out.println("2. See cat list");
        System.out.println("3. Update cat Information");
        System.out.println("4. Add new Cat");
        input();
    }

    public static void addCat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = in.next();
        System.out.println("Enter color: ");
        String color = in.next();
        System.out.println("Enter age : ");
        int age = in.nextInt();
        System.out.println("Enter weight : ");
        int weight = in.nextInt();
        Cat cat = new Cat(name, color, weight, age);
        ProjectC.catList.add(cat);
        System.out.println("added successfully");
        menu();
    }

    public static void input() {
        System.out.print("Enter Your choice : ");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "1":
                catDetails();
                break;
            case "2":
                viewCatList();
                break;
            case "3":
                getCat();
                break;
            case "4":
                addCat();
                break;
            default:
                System.out.println("invalid Input");
                break;
        }
    }

    public static void catDetails() {
        System.out.print("Enter Cat name : ");
        Scanner in = new Scanner(System.in);
        String catName = in.next();
        Cat currentCat = null;
        for (Cat cat : ProjectC.catList) {
            if (cat.name.equalsIgnoreCase(catName)) {
                currentCat = cat;
            }
        }
        if (currentCat == null) {
            System.out.println("No such Cat exist in the list");
            menu();
        } else {
            currentCat.catDetails();
            menu();
        }
    }

    public static void viewCatList() {
        for (Cat cat : ProjectC.catList) {
            System.out.println();
            cat.catDetails();
        }
        menu();
    }

    public static void getCat() {
        System.out.println();
        System.out.print("Enter Cat name : ");
        Scanner in = new Scanner(System.in);
        String catName = in.next();
        Cat currentCat = null;
        for (Cat cat : ProjectC.catList) {
            if (cat.name.equalsIgnoreCase(catName)) {
                currentCat = cat;
            }
        }
        if (currentCat == null) {
            System.out.println("No such Cat exist in the list");
            menu();
        } else {
            currentCat.catDetails();
            System.out.println();
            updateCatInfo(currentCat);
        }
    }

    public static void updateCatInfo(Cat cat) {
        System.out.println("1.Update Name");
        System.out.println("2.Update colour");
        System.out.println("3.Update weight");
        System.out.println("4.Update age");
        System.out.println("5.Main menu");
        System.out.print("Enter Your choice : ");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "1":
                changeName(cat);
                break;
            case "2":
                changeColour(cat);
                break;
            case "3":
                changeWeight(cat);
                break;
            case "4":
                changeAge(cat);
                break;
            case "5":
                menu();
                break;
            default:
                System.out.println("Invalid input");
                updateCatInfo(cat);
                break;
        }
    }

    static void changeName(Cat cat) {
        System.out.print("Enter new Name : ");
        Scanner in = new Scanner(System.in);
        cat.name = in.next();
        System.out.println("Successfully Updated!");
        menu();
    }

    static void changeWeight(Cat cat) {
        System.out.print("Enter new Weight : ");
        Scanner in = new Scanner(System.in);
        cat.weight = in.nextDouble();
        System.out.println("Successfully Updated!");
        menu();
    }

    static void changeColour(Cat cat) {
        System.out.print("Enter new Colour : ");
        Scanner in = new Scanner(System.in);
        cat.colour = in.next();
        System.out.println("Successfully Updated!");
        menu();
    }

    static void changeAge(Cat cat) {
        System.out.print("Enter new Age : ");
        Scanner in = new Scanner(System.in);
        cat.age = in.nextInt();
        System.out.println("Successfully Updated!");
        menu();
    }

}
