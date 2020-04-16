import java.util.ArrayList;

public class Digits
{
    //private ArrayList<Integer> digitList;
    private int[] digitList;

    // part (a)
    public Digits(int num)
    {
        digitList = new int[(""+num).length()];

        for (int i = digitList.length-1; i >= 0; i--)
        {
            digitList[i] = num % 10;
            num /= 10;
        }
        /*digitList = new ArrayList<Integer>;
        while (num > 0)
        {
            digitList.add(0, num%10);
            num /= 10;
        }*/
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 1; i < digitList.size(); i++)
            if (digitList.get(i-1) >= digitList.get(i))
                return false;
        return true;
    }
}
