public class OperArith implements ArithExpr {
    ArithExpr left;
    ArithExpr right;

    public OperArith(ArithExpr left, ArithExpr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double eval() {
        return 0;
    }
}
