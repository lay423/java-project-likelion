package java1007.populationRiview;

public class PopulationMoveReview {
    private int fromSido;
    private int toSido;

    public PopulationMoveReview(int fromSido, int toSido) {

        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    public PopulationMoveReview(String fromSido, String toSido) {

        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
