import java.util.*;

public class CodeTest {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        int[] a = { 0, 1, 2, 1, 2, 1, 2 };

    }

    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        HashMap<Integer,Integer> h= new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if(h.containsKey(arr.get(i))){
                h.put(arr.get(i),arr.get(i)+1);
            }
            else{
                h.put(arr.get(i),1);
            }
        }
        for (Map.Entry<Integer,Integer> i : h.entrySet()) {
            if(i.getValue()==1){
                return i.getKey();
            }
        }
        return -1;
    }

}
