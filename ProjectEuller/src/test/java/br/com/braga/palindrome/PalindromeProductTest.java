package br.com.braga.palindrome;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ericbraga on 29/10/15.
 */
public class PalindromeProductTest {

    @Test
    public void _11IsAPalindromeNumber() {
        PalindromeProduct palindrome = new PalindromeProduct();
        Assert.assertTrue(palindrome.isPalindrome(11));
    }

    @Test
    public void _308IsNotAPalindromeNumber() {
        PalindromeProduct palindrome = new PalindromeProduct();
        Assert.assertFalse(palindrome.isPalindrome(308));
    }

    @Test
    public void maxPalindromeForTwoDigitsIs9009() {
        PalindromeProduct palindrome = new PalindromeProduct();
        Assert.assertEquals(9009, palindrome.getLargestPalindrome(2));
    }


}