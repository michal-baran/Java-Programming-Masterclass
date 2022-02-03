public class FlourPacker {
    public static boolean canPack(int BigCount, int smallCount, int goal) {
        if (BigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int a = 0;
        int b = 0;

        while (a <= BigCount) {
           // System.out.println("a=" + a);
            while (b <= smallCount) {
              //  System.out.println("b=" + b);
                if (goal==a*5+b) {
                    return true;
                }
                b++;
            }
            b=0;
            a++;
        }
        return false;
    }
}