package String.substring;

public class SubString {
    public static void main(String[] args) {
        // SUbstring method is present in string to obtain the part of the string
        // there r 1 overloaded method, substring(start), substring(start, end+1)
        String s= "StringValueIsHere";
        String substr= s.substring(0, 6); // here index 6 will not be included
        String substr1= s.substring(6); // here rest of the string will be returned from index 6        

    }
}
