public class RecursionTest
{

    private int recursiveDigitSum(int n)
    {
        return n == 0 ? 0 : n%10 + recursiveDigitSum(n/10);
    }

    private int iterativeDigitSum(int n)
    {
        int count  = 0;
        while (n > 0) {
            count += n % 10;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args)
    {
    }

}
