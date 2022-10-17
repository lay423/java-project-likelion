package java1017.drawStar;

public class DrawStar {
    private char c;

    public DrawStar() {
        this.c = '*';
    }

    public DrawStar(char c) {
        this.c = c;
    }

    public void drawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void drawPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i * 2 - 1; j > 0; j--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void drawRhombus(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = n / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (i + 1) * 2 - 1; j > 0; j--) {
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = n / 2 - 1; i >= 0; i--) {
            for (int j = n / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (i + 1) * 2 - 1; j > 0; j--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
