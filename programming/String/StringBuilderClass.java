package String;

// StringBuilder class is present inside java.lang package
// this class is used to create mutable string objects 
// StringBuilder class is same as StringBuffer class except it is non synchronized i.e not thread safe

public class StringBuilderClass {
    public static void main(String[] args) {
        // same as StringBuffer
        StringBuffer sb = new StringBuffer("StringBuffer ");
        System.out.println(sb);

        // * Methods of StringBudder and StringBuilder (both are same)
        // append is same object
        sb.append("is a class");
        System.out.println(sb);

        //insert at perticular index or range
        sb.insert(12, " in java ");
        System.out.println(sb);

        // delete sequence in specifiv range
        sb.delete(12, 20);
        System.out.println(sb);

        //replaces a range with any string
        sb.replace(0, 12, "StringBuilder");
        System.out.println(sb);

        // reverse the string
        sb.reverse();
        System.out.println(sb);

    }
}
