public class Main {
    public static void main(String[] args) {
        Utilities utilities = new Utilities();

        System.out.println(utilities.removePairs("AABCDDEFF"));
        System.out.println(utilities.removePairs("A"));
        System.out.println(utilities.removePairs(null));
    }
}
