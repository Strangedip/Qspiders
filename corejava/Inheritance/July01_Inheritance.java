// package Inheritance;

class Livings{
    String status="Alive";
    int age;
    void planet(){
        System.out.println("Lives on earth");
    }
}

class Human extends Livings {  //inheriting all properties and methods from livings class
    String name= "Sandip";
    
    Human(int age){
        this.age=age;
    }
}

public class July01_Inheritance {
    public static void main(String[] args) {
        Human h1=new Human(12);
        h1.planet();
        System.out.println(h1.age);
        System.out.println(h1.name);
    }
    
}
