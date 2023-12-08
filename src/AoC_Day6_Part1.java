public class AoC_Day6_Part1 {
    public static void main(String[] args) {
        int[] time = {48, 93, 84, 66};
        int[] distance = {261, 1192, 1019, 1063};
        long numberOfWaysToWin = 1;

        if (time.length == distance.length) {
            for (int i = 0; i < time.length; i++) {
                int currentTime = time[i];
                int currentDistance = distance[i];
                int waysToWin = 0;

                for (int buttonHold = 0; buttonHold <= currentTime; buttonHold++) {
                    int remainingTime = currentTime - buttonHold;
                    int speed = buttonHold;
                    int distanceTravelled = speed * remainingTime;

                    if (distanceTravelled >= currentDistance) {
                        waysToWin++;
                    }
                }
                numberOfWaysToWin *= waysToWin;
            }
        }
        System.out.println(numberOfWaysToWin);
    }
}
