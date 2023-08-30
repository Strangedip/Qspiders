package ArrayPrograms.level3;

public class TripletSum {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int sum=9;
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i]+a[j]+a[k]==sum){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
        
    }
}
