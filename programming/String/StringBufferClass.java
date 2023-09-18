package String;

// StringBuffer is present inside java.lang package
// this class is used to create mutable string object 
//* string buffer class of java is thread safe i.e multiple threads cannot access simulteneously 

//*   String                vs              StringBuffer Class
//  - Immutable                           - Mutable
//  - slow and consumes more              - fast and consumes less memory 
//    memory when we concatenate            when concatenated with too many string
//    too many strings because 
//    everytime is creates new object
//  - it overrides equals method of       - It does not override equals method of object class
//    object calss
//  -  it uses String Constant pool       - it uses heap memory


public class StringBufferClass {
    public static void main(String[] args) {
        //only way to create string buffer using new keyword
        StringBuffer sb= new StringBuffer("New String ");
        System.out.println(sb);  
        //changes are done in same object inside heap area
        sb.append("Other String");
        System.out.println( sb);
        
    }
}
