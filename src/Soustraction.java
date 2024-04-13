public class Soustraction extends OperArith{
    public Soustraction(ArithExpr left, ArithExpr right) {
        super(left, right);
    }

    @Override
    public double eval() {
        return left.eval() - right.eval();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
