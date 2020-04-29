public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");

        } else {
            for (int i=1; i <= number; i++) {
                for (int j=1; j <= number; j++) {
                    if ((i == 1) || (i == number)) {
                        System.out.print("*");
                        continue;
                    }
                    if ((j == 1) || (j == number) || (j == i) || (j == ((number - i) + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

