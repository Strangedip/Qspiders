package String;

/*
 * String is a class in java present inside java.lang package
 * String is a final class (we cannot inherit String class)
 * String class inherits Object class and 3 interfaces (ChasSequence, Comparable, Serializable)

 * String Object creation
 * 1.Using String Literal (String s = String Literal;)
 *      whenever we create string objects using string literal first the JVM checks String Constant Pool (SCP)   
 *      if we have any object with tha same data,
 *      if no object is present then new Object is created in SCP and address is returned
 *      if Object is present then same address is returned
 *  
 * 2.Using new keyword (String s = new String(String Literal);)
 *      whenever we create string object using new keyword object is created inside Heap area and address is returned
 *      after that if no object is present in SCP with the same data then new object will be created in SCP
 *      and addres will be returned to JVM     
 */
public class StringIntro {
    public static void main(String[] args) {
        // same object in SCP
        String a = "strange";
        String b = "strange";
        System.out.println(a == b);

        // diffrent object in HEAP and 1 created in SCP
        String c = new String("Strangedip");
        String d = new String("Strangedip");
        System.out.println(c == d);

        String e = "Strangedip";
        // getting SPC object address of the same String data
        System.out.println(c.intern() == e);
    }
}
