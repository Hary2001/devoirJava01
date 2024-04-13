public class Addition implements ArithExpr {
    private ArithExpr left;
    private ArithExpr right;

    public Addition(ArithExpr left, ArithExpr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double eval() {
        return left.eval() + right.eval();
    }
}
