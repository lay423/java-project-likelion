package java1018.star;

public class StarSquare {
    public void drawSquareStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int n1, int n2) {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarSquare starSquare = new StarSquare();
        starSquare.drawSquareStar(3);
        System.out.println();
        starSquare.drawRectangle(2, 3);
    }
}
