package NumberConversion;

public class OctToDec {
    public static void main(String[] args) {
        int oct=1011;
        int dec=0;
        int power=1;
        while(oct>0){
            int lastdDigit= oct%10;
            dec= lastdDigit * power;
            power = power*2;
            oct=oct/10;
        }
        System.out.println(dec);
        
    }
}
