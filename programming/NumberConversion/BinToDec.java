package NumberConversion;

public class BinToDec {
    public static void main(String[] args) {
        int bin=1011;
        int dec=0;
        int power=1;
        while(bin>0){
            int lastdDigit= bin%10;
            dec= lastdDigit * power;
            power = power*2;
            bin=bin/10;
        }
        System.out.println(dec);
        
    }
}
