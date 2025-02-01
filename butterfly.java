public class butterfly {
    public static void main(String[] args) {
        int n = 4; // Number of rows for the butterfly pattern

        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.err.print(" ");
            }

            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }

            // Move to the next line after each row
            System.err.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.err.print(" ");
            }

            // Right side stars
            for (int j = 1; j <= i; j++) {
                System.err.print("*");
            }

            // Move to the next line after each row
            System.err.println();
        }
    }
}

