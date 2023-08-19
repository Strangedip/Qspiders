package NumberConversion;

public class HexToDec {
    public static void main(String[] args) {
        String hex = "12A3";
        int dec = 0;
        int power = 1;
        int i = hex.length() - 1;
        while (i >= 0) {
            char c = hex.charAt(i);
            int value = 0;
            if (c >= '0' && c <= '9') {
                switch (c) {
                    case '0':
                        value = 0;
                        break;
                    case '1':
                        value = 1;
                        break;
                    case '2':
                        value = 2;
                        break;
                    case '3':
                        value = 3;
                        break;
                    case '4':
                        value = 4;
                        break;
                    case '5':
                        value = 5;
                        break;
                    case '6':
                        value = 6;
                        break;
                    case '7':
                        value = 7;
                        break;
                    case '8':
                        value = 8;
                        break;
                    case '9':
                        value = 9;
                        break;
                }
            } else if (c == 'A' || c == 'a') {
                value = 10;
            } else if (c == 'B' || c == 'b') {
                value = 11;
            } else if (c == 'C' || c == 'c') {
                value = 12;
            } else if (c == 'D' || c == 'd') {
                value = 13;
            } else if (c == 'E' || c == 'e') {
                value = 14;
            } else if (c == 'F' || c == 'f') {
                value = 15;
            } else {
                System.out.println("Invalid Hex number");
                return;
            }
            dec = dec + value * power;
            power = power * 16;
            i--;
        }
        System.out.println(dec);
        System.out.println(hexToDec(hex));
    }

    // Better Way
    public static int hexToDec(String hex) {
        int dec = 0;
        int power = 1;
        int i = hex.length() - 1;
        while (i >= 0) {
            char c = hex.charAt(i);
            int value = 0;

            if (c >= '0' && c <= '9') {
                // ascii value of 0 is 48
                value = ((int) c) - 48;
            } else if (c >= 'A' && c <= 'F') {
                // ascii value of A is 65
                value = ((int) c) - 65 + 10;
            } else if (c >= 'a' && c <= 'f') {
                // ascii value of a is 97
                value = ((int) c) - 97 + 10;
            }
            dec = dec + value * power;
            power = power * 16;
            i--;
        }
        return dec;
    }
}
