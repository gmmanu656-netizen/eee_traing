package Patterns;

public class ZigZag {
    static void zigZagFast(int cools) {
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= cools; c++) {
                if (r == 1 && c % 4 == 3 || r == 2 && c%2 == 0 || r == 3 && c % 4 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        zigZagFast(9);
        zigZagFast(13);
    }
}




