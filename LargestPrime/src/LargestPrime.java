public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int i=number-1;
        while (i>1) {
            if (number%i==0) {
                number=i;
  //              System.out.println(i);
            }
            i--;
        }
        return number;
    }
}