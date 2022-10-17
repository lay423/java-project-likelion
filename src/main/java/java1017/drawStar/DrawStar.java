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
}
