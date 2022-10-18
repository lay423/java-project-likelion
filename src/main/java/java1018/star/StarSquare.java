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

    public static void main(String[] args) {
        StarSquare starSquare = new StarSquare();
        starSquare.drawSquareStar(3);

    }
}
