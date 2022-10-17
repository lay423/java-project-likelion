package java1017.drawStar;

public class DrawStar {
    private char c;

    public DrawStar() {
        this.c = '*';
    }

    public DrawStar(char c) {
        this.c = c;
    }

    public void draw(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
