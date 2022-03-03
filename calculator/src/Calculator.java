import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // Понимаю, что возвращать 0 математически не верно.
    // В условии к задаче написано "Для решения проблемы можете реализовать аналог,
    // либо сделать полноценный многострочный блок кода с { return })
    // Значит ли это, что есть решение поймать ошибку сразу в тернарном операторе?
    // или необходимо писать дополнительный код чтобы поймать ошибку?
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
