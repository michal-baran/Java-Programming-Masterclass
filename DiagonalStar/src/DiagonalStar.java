public class DiagonalStar {
    public static void printSquareStar(int number) {
        int row = 1;
        int column = 1;

        if (number < 5) System.out.println("Invalid Value");
        else {
            while (row <= number) {
                while (column <= number) {
                    if (row == 1 || row == number || column == 1 || column == number || row == column || column == number - row + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    column++;
                }
                column = 1;
                row++;
                System.out.println("");
            }
        }
    }
}