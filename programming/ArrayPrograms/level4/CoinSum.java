package ArrayPrograms.level4;

public class CoinSum {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10 };
        int target = 104;
        System.out.println(minCoinCount(coins, target));
    }

    public static int allCoinComb(int[] coins, int target) {
        
        return -1;
    }

    public static int minCoinCount(int[] coins, int target) {
        int i = coins.length - 1;
        int temp = target;
        int count = 0;
        while (i >= 0) {
            while (temp >= coins[i]) {
                temp = temp - coins[i];
                count++;
                if (temp == 0) {
                    return count;
                }
                if (temp < 0) {
                    temp = temp + coins[i];
                    break;
                }

            }
            i--;
        }
        return -1;
    }

}
