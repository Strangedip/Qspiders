package NumberConversion;

public class BinToOct_Hex {
    public static void main(String[] args) {
        int bin = 1011;

        // First convert binary or octal into decimal
        int dec = 0;
        int power = 1;
        while (bin > 0) {
            int lastdDigit = bin % 10;
            dec = dec + lastdDigit * power;
            power = power * 2;
            bin = bin / 10;
        }

        // convert the decimal into octal or hexadecimal
        System.out.println(DecToBin_Oct.decToOcatal(dec));
        System.out.println(DecToHexa.decToHexaDecimal(dec));
    }
}
