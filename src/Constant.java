public class Constant implements ArithExpr {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double eval() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
