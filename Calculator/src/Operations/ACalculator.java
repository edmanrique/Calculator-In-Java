package Operations;

/*
 *
 * @author Edison Manrique @edmanrique
 */
public class ACalculator {

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double substract(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        return n1 / n2;
    }

    public double exponent(double n1, double n2) {

        double exponent = 1;

        for (int i = 0; i < n2; i++) {
            exponent *= n1;
        }

        return exponent;
    }

    public double factorial(double n1) {
        double factorial = 0;
        double count = n1 - 1;

        while (count != 0) {
            factorial = n1 * count;
            n1 = factorial;
            count--;
        }

        return factorial;
    }
    
    public double square_root(double n1){
        double root = Math.sqrt(n1);
        return root;
    }

}
