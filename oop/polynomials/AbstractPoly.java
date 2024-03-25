package oop.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] tmp = new double[Math.max(1, degree())];
        for (int i = 1; i <= degree(); i++) { // es degree =3 polinomio grado 3
            tmp[i - 1] = coefficient(i) * i; // la i corrisponde al grado
        }
        return tmp;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Poly p)) {
            return false;
        }
        if (degree() != p.degree()) {
            return false;
        }
        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != p.coefficient(i)) {
                return false;
            }
        }
        return true;
    }
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <degree() ; i++) {
            sb.append(coefficient(i)).append("x^").append(degree());
        }
        return sb.toString();
    }
}
