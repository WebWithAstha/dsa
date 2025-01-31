package binary;

public class Q1011_MinCapacityToShip {


    public static boolean validateMaxWeight(int[] weights, int days, int maxWeight) {

        int currentMax = 0;
        for (int wei : weights) {

            // if weight load krna baki h but days khtm ho gye
            if(days == 0) return false;

            // if wei can be loaded in a day
            if (currentMax + wei <= maxWeight) {
                currentMax += wei;
            }
            // day's limit reached
            else {
                days--;
                currentMax = wei;
            }

            // when can be true
            // jb sare days load hojayege ( last day load ho ra hoga ) => days = 1
            // jb maxWeight capacity bht zada h or sare weight pehle hi load ho gye => day > 1

        }
            return days >= 1;


    }


    public static int shipWithinDays(int[] weights, int days) {


        int ans = -1;
        // setting up range
        int left = weights[0];
        int right = 0;

        // calculating right i.e max weight ship can take
        for (int wei : weights) {
            right += wei;
            left = Math.max(wei, left); // make sure left contains max weight package
        }

        while (left <= right) {

            // max wei package in 1 day
            int maxWei = left + (right - left) / 2;

            // checking if maxWei is possible ans

            // if validates
            if (validateMaxWeight(weights, days, maxWei)) {
                ans = maxWei;
                right = maxWei - 1;
            }
            // if maxWei is not valid ans
            else {
                left = maxWei + 1;
            }


        }


        return ans;

    }

    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights, days));
    }
}
