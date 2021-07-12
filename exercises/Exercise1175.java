import java.math.BigInteger;

class Solution {

    public int numPrimeArrangements(int n) {
        int numPrimes = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) numPrimes++;
        }

        BigInteger out = factorial(numPrimes).multiply(factorial(n-numPrimes));
        out = out.mod(BigInteger.valueOf(1_000_000_000 + 7));
        System.out.println(out);
        return out.intValue();
    }

    public BigInteger factorial(int n) {
        if (n == 0) return BigInteger.ONE;

        // n >= 1 here
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    /**
     * This method determines whether an integer is prime or not.
     * @param n the number on which to perform the primality test.
     * @return true iff n is prime.
     */
    public static boolean isPrime(long n)
    {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i <= Math.sqrt(n); i += 6)
        {
            if (n % i == 0) return false;
            if (n % (i + 2) == 0) return false;
        }
        return true;
    }
}
