import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {

    Convert convert = new Convert();

    @Test
    public void dollarToEuroTest(){

        String expect = ("Amount in Euro: 94.0");

        convert.setCurrency("USD");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Euro");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Euro: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void euroToDollarTest(){

        String expect = ("Amount in USD: 94.0");

        convert.setCurrency("Euro");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("USD");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in USD: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void euroToPoundTest(){

        String expect = ("Amount in Pound: 77.08");

        convert.setCurrency("Euro");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Pound");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Pound: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void poundToRupeeTest(){

        String expect = ("Amount in Rupee: 5602.24");

        convert.setCurrency("Pound");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Rupee");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Rupee: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void rupeeToCanTest(){

        String expect = ("Amount in Can: 1.9320843091334896");

        convert.setCurrency("Rupee");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Can");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Can: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void canToSingTest(){

        String expect = ("Amount in Sing: 108.33333333333331");

        convert.setCurrency("Can");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Sing");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Sing: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void singToSwissTest(){

        String expect = ("Amount in Swiss: 70.62937062937063");

        convert.setCurrency("Sing");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Swiss");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Swiss: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void swissToRinggitTest(){

        String expect = ("Amount in Ringgit: 442.5742574257426");

        convert.setCurrency("Swiss");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Ringgit");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Ringgit: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void ringgitToYenTest(){

        String expect = ("Amount in Yen: 2591.4988814317676");

        convert.setCurrency("Ringgit");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Yen");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Yen: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }

    @Test
    public void yenToYuanTest(){

        String expect = ("Amount in Yuan: 5.973756906077348");

        convert.setCurrency("Yen");
        convert.setAmount(100.0);
        convert.setDesiredCurrency("Yuan");
        convert.convertToUSD();
        convert.getAmountUSD();
        convert.convertToDesire();

        String actual = ("Amount in Yuan: " + convert.getAmount());

        Assert.assertEquals(expect, actual);

    }
}
