/**
 * <p>Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение
 * java.lang.IllegalArgumentException с сообщением "Expected non-negative number, got ?",
 * где вместо вопросика будет подставлено фактически переданное в метод число.</p>
 */

public class SqrtOperation {
    public double sqrt(double number) {
        double t;
        double squareRoot = number / 2;
        if (number <0) {
            //try {
              throw new IllegalArgumentException("Expected non-negative number, got " + number);
            // catch (IllegalArgumentException e) {
           //System.out.println("Expected non-negative number, got" + number);
        }
       else  return Math.sqrt(number);
    }
}

