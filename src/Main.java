public class Main {
    public static void main(String[] args) {
        // Instanciation des constantes
        ArithExpr constant1 = new Constant(5.2);
        ArithExpr constant2 = new Constant(1.1);
        ArithExpr constant3 = new Constant(50.0);
        ArithExpr constant4 = new Constant(15.0);

        // Creation des expressions de constantes
        ArithExpr expression = new Addition(constant1, constant2);

        // Affichage de l'expression
        System.out.println("Evaluation result: " + expression.eval());
    }
}
