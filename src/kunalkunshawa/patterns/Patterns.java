package kunalkunshawa.patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern5(9);
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     */
    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    1
    12
    123
    1234
    12345
    */
    static void pattern4(int n) {
        for (int row = n; row >= 0; row--) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    /*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *
    * * * * * * * *
    * * * * * * * * *
    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
    */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
