public class SqrtOperation {
    public static void main( String [] args) {
        System.out.println(sqrttest( 0));
    }
    public static double sqrttest( double number) {
        double t;
        double squareRoot = number / 2;
        if (number <=0) {
           /*try {
                throw new IllegalArgumentException("Кота не существует");
            } catch (IllegalArgumentException e) {
                System.out.println( e.getMessage());
            }*/
            throw new IllegalArgumentException("Кота не существует");
        }
        else do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;

    }
}
