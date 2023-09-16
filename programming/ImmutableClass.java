// to create our own immuttable class 3 steps needs to be done
// 1. make that class final to stop inheritance
// 2. make all variable 'private final' to stop reinitialization and direct access
// 3. create only getter method for the members
// once object of the class has been created it is immutable
final class Immutable{
    private final int id;
    private final String name;
    Immutable(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return id+" "+name;
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Immutable i= new Immutable(1, "sandip");
        System.out.println(i);
        // i.id=2; not allowed as it is immutable now
        System.out.println(i.getName());
    }
}
