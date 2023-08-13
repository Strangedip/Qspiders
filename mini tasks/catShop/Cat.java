public class Cat {
    String name;
    String colour;
    double weight;
    int age;

    public Cat(String name, String colour, double weight, int age) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.age = age;
    }

    public void catDetails() {
        System.out.println("name   : " + name);
        System.out.println("colour : " + colour);
        System.out.println("weight : " + weight + " kg");
        System.out.println("age    : " + age + " months");
    }
}
