public class AoC_Day6_Part2 {

    public static void main(String[] args) {
        long time = 48938466L;
        long distance = 261119210191063L;
        long waysToWin = numberOfWins(time, distance);
        System.out.println(waysToWin);
    }

    private static long numberOfWins(long time, long distance) {
        long waysToWin = 0;

        for (long buttonHold = 14; buttonHold <= time - 14; buttonHold++) {
            long remainingTime = time - buttonHold;
            long speed = buttonHold;
            long distanceTravelled = speed * remainingTime;

            if (distanceTravelled >= distance) {
                waysToWin++;
            }
        }

        return waysToWin;
    }
}
