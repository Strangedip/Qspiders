package NumberConversion;

public class BinToDec {
    public static void main(String[] args) {
        int bin = 1011;
        int dec = 0;
        int power = 1;
        while (bin > 0) {
            int lastdDigit = bin % 10;
            dec = dec + lastdDigit * power;
            power = power * 2;
            bin = bin / 10;
        }
        System.out.println(dec);
    }

    public static void octToDec(int oct) {
        oct=12;
        int dec = 0;
        int power = 1;
        while (oct > 0) {
            int lastdDigit = oct % 10;
            dec = dec + lastdDigit * power;
            power = power * 8;
            oct = oct / 10;

        }
        System.out.println(dec);

    }
}
