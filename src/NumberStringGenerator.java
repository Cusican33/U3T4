public class NumberStringGenerator
{

    private String numberString;
    private int bigNumCount;

    // constructor
    // Precondition: numberCount > 0
    public NumberStringGenerator(int numberCount)
    {
        numberString = "";
        for (int i = 0; i < numberCount; i++)
        {
            int x = generateRandomNumber();
            if (x > 50) bigNumCount++;
            numberString += x + "_";
        }
    }

    public String getNumberString() {
        return numberString;
    }

    public int getBigNumCount() {
        return bigNumCount;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }
}
