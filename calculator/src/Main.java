public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        // возникает Exception ArithmeticError из-за деления на 0. Нужно ловить
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

    }
}
