public class Main {
    public static void main(String[] args) {
        // Instanciation des constantes (essai)
        ArithExpr constant1 = new Constant(1.8);
        ArithExpr constant2 = new Constant(2.6);
        ArithExpr constant3 = new Constant(3.4);
        ArithExpr constant4 = new Constant(4.2);
        ArithExpr constant5 = new Constant(5.9);
        ArithExpr constant6 = new Constant(6.7);
        ArithExpr constant7 = new Constant(7.5);
        ArithExpr constant8 = new Constant(8.3);
        ArithExpr constant9 = new Constant(9.1);

        // Instanciation des constantes
        ArithExpr A = new Constant(3.0);
        ArithExpr B = new Constant(4.7);
        ArithExpr C = new Constant(2.3);
        ArithExpr D = new Constant(5.0);

        // Creation des expressions de constantes (essai)
        ArithExpr expression1 = new Addition(constant1, constant2);
        ArithExpr expression2 = new Soustraction(constant1, constant2);

        // Creation de l'expression : 3 + (4.7 + 2.3) * 5
         ArithExpr expression = new Addition(constant1, new Multiplication(new Addition(constant2, constant3), constant4));

        // Affichage de l'expression (essai)
        System.out.println(expression1 + " = " + expression1.eval());
        System.out.println(expression2 + " = " + expression2.eval());

        // Affichage de l'expression
        System.out.println(expression + " = " + expression.eval());
    }
}
