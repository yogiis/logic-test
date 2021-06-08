import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

    public boolean isPalindromeWithVariable(String value) {
        String y = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            y = y + value.charAt(i);
        }
        System.out.println(y);

        return y.equals(value);
    }

    public boolean isPalindromeWithoutVariable(String value) {
        for (int i = value.length(); i >= 0; i--) {
            int indexFirst = i;
            int indexLast = value.length() - 1 - i;

            if (indexFirst == indexLast) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        Assert.assertTrue(isPalindromeWithVariable("katak"));
        Assert.assertTrue(isPalindromeWithoutVariable("kodok"));
        Assert.assertTrue(isPalindromeWithoutVariable("ini"));
        Assert.assertTrue(isPalindromeWithVariable("ada"));
        Assert.assertFalse(isPalindromeWithVariable("ayam"));
        Assert.assertFalse(isPalindromeWithoutVariable("adab"));
        Assert.assertTrue(isPalindromeWithVariable("ada"));
    }

}
