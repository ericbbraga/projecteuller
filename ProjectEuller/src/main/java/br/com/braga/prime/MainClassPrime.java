package br.com.braga.prime;

/**
 * Created by ericbraga on 29/10/15.
 */
public class MainClassPrime {
    public static void main(String[] args) {
        LargestPrimeFactor largestPrime = new LargestPrimeFactor();
        System.out.println(largestPrime.getLargest(600851475143L));
    }
}
