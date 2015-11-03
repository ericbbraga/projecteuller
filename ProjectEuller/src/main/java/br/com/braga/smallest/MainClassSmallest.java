package br.com.braga.smallest;

/**
 * Created by ericbraga on 30/10/15.
 */
public class MainClassSmallest {
    public static void main(String[] args) {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        System.out.println(smallestMultiple.getMinimumMultipleCommonUntil(20));
    }
}
