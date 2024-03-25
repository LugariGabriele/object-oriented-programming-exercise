package oop.basic;

import java.util.Objects;

/* Write a class named RationalNumber representing a rational number. RationalNumbers are immutable objects,
 indeed they cannot be changed after creation. Internally, the class represents numerator and denominator as int values.
 RationalNumbers must support equality with other RationalNumbers (see Object.equals(), Object.hashCode()) The class provides the following methods:

public RationalNumber(int numerator, int denominator) creating the rational number.
Before creating the object, numerator and denominator have to be simplified (i.e., divided by their greatest common divisor).
public getNumerator() returning the numerator.
public getDenominator() returning the denominator.
public RationalNumber add(RationalNumber o) returning a RationalNumber object representing the sum of the current number and another number.
public RationalNumber multiply(RationalNumber o) returning a RationalNumber object representing the multiplication of the current number and another number.
public String toString().*/
public class RationalNumber {
    int numerator;
    int denominator;
    public RationalNumber(int numerator, int denominator) {
        int mcm = greatestCommonDivisor(numerator, denominator);
        this.numerator=numerator/mcm;
        this.denominator=denominator/mcm;
    }
    public int getNumerator(){
    return numerator;
    }
    public  int getDenominator(){
        return denominator;
    }

    /**
     *  2/3+4/6= ((2*2)+4*1)/6
     *
     */
    public RationalNumber add(RationalNumber o){
    int lcm=leastCommonMultiple(denominator,o.getDenominator());
    int numersum= numerator*(lcm/denominator)+ o.getDenominator()*(lcm/o.getDenominator());
     return new RationalNumber(numersum,lcm);
    }
    public RationalNumber multiply(RationalNumber o){
    int nummultiyply= numerator*o.getNumerator();
    int denmultiply = denominator*o.getDenominator();
    return new RationalNumber(nummultiyply,denmultiply);

    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}



