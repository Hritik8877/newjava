public class damru {
    public static void printStarHollowSquareWithDiagonals(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j == n - i + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        printStarHollowSquareWithDiagonals(n);
    }
}
