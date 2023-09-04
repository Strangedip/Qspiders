package Array2D;
// jagged arrays are 2D arrays with diffrent size of arrays fit into other array
public class JaggedArray {
    public static void main(String[] args) {
        // specifying outer array size only
        int[][] a= new int[3][];

        // every element will be initiated as null object
        System.out.println(a[0]);

        //initiating that index array with specific size
        a[0]= new int[4];
        a[1]= new int[3];
        a[2]= new int[5];
        System.out.println(a[0]);
    }
}
