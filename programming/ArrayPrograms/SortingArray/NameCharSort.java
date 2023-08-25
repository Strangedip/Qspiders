package ArrayPrograms.SortingArray;

import java.util.Arrays;

public class NameCharSort {
    public static void main(String[] args) {
        char[] a={'S','A','N','D','I','P'};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
}
