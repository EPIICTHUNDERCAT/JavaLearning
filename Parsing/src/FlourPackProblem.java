public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        while (bigCount > 0 && goal >= 5) {
            goal -= 5;
            bigCount--;
            System.out.println(bigCount);
            System.out.println(goal);

        }
        System.out.println(smallCount);
        return smallCount >= goal;
    }


}
