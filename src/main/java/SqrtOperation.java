/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */

public class SqrtOperation {
    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + number);
        }
        double squareRoot = 1.0;
        double check = 0.0;
        for (int i = 0; i <= 100; i++) {
            if (number == 0) {
                squareRoot = 0.0;
                break;
            }
            squareRoot = squareRoot - (squareRoot * squareRoot - number) / (2 * squareRoot);
            if (i != 0) {
                if (check - squareRoot < 0.00000001) {
                    break;
                }
            }
            check = squareRoot;
        }
        return squareRoot;
    }
}

