package oop.polynomials;

public interface Poly {
    /**
     * a method coefficient(int degree) returning the coefficient of a given degree (0 ... n).
     *
     * @param degree
     * @return coefficenet
     */
    double coefficient(int degree);

    /**
     * a method coefficients() returning a double[] containing all the coefficients.
     */

    double[] coefficients();

    /**
     * a method degree() returning the degree of the polynomial (the number of coefficients - 1).
     */

    int degree();

    /**
     * a method derivative() returning the derivative polynomial.
     */
    Poly derivative();

}
