package Patterns;

public class IdentityMatrix {
    static void identityMatrix(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == c) {
                    System.out.println(" 1 ");
                } else {
                    System.out.println(" 0 ");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        identityMatrix(5);
    }
}




