package oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly{
double [] coefficents;

    public ArrayPoly(double[] coefficents) {
        this.coefficents = coefficents;
    }

    @Override
    public double coefficient(int degree) {
        return coefficents[degree];
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficents,coefficients().length);
    }

    @Override
    public int degree() {
        return coefficents.length-1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
