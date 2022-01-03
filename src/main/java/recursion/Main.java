package recursion;

public class Main {

    public static Integer getNumberOfPossibleWays(Integer steps, Integer[] hops) {
        return getNumOfPossible("", steps, hops);
    }

    public static Integer getNumOfPossible(String dash, Integer steps, Integer[] hops) {
        if (steps == 0) {
            System.out.println(dash + ":" +steps + " 1");
            return 1;
        } else if (steps < 0) {
            System.out.println(dash + ":" +steps + " 0");
            return 0;
        }
        System.out.println(dash + ":" + steps + " recurse");
        int sum = 0;
        for (Integer h: hops) {
            sum += getNumOfPossible(dash + "*", steps - h, hops);
        }
        return sum;
    }
}
