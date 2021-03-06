package se.kth.iv1350.POS.model;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
class AmountTest {

	@Test
	void testAddAmount() {
		int amountOfOperand1 = 10;
		int amountOfOperand2 = 20;
		Amount amountUnderTest = new Amount (amountOfOperand1, "SEK");
		amountUnderTest.addAmount(amountOfOperand2);
		int expRes = amountOfOperand1 + amountOfOperand2;
		int result = amountUnderTest.getAmount();
		assertEquals (expRes, result, "Wrong addition result");
	}
	@Test
	void testAddAmountNegResult() {
		int amountOfOperand1 = 10;
		int amountOfOperand2 = -20;
		Amount amountUnderTest = new Amount (amountOfOperand1, "SEK");
		amountUnderTest.addAmount(amountOfOperand2);
		int expRes = amountOfOperand1 + amountOfOperand2;
		int result = amountUnderTest.getAmount();
		assertEquals (expRes, result, "Wrong addition result");
	}
	@Test
	void testAddAmountNZeorRes() {
		int amountOfOperand1 = 20;
		int amountOfOperand2 = -20;
		Amount amountUnderTest = new Amount (amountOfOperand1, "SEK");
		amountUnderTest.addAmount(amountOfOperand2);
		int expRes = amountOfOperand1 + amountOfOperand2;
		int result = amountUnderTest.getAmount();
		assertEquals (expRes, result, "Wrong addition result");
	}
	
	@Test
    void testAmountSubtraction() {
        int amountOfOperand1 = 20;
        int amountOfOperand2 = 10;
        Amount Operand1 = new Amount (amountOfOperand1, "SEK");
        Amount Operand2 = new Amount (amountOfOperand2, "SEK");

        int expRes = amountOfOperand1 - amountOfOperand2;
        int result = Operand1.amountSubtraction(Operand2);
        assertEquals (expRes, result, "Wrong subtraction result");
    }
    @Test
    void testAmountSubtractionNegResult() {
        int amountOfOperand1 = 20;
        int amountOfOperand2 = -10;
        Amount Operand1 = new Amount (amountOfOperand1, "SEK");
        Amount Operand2 = new Amount (amountOfOperand2, "SEK");

        int expRes = amountOfOperand1 - amountOfOperand2;
        int result = Operand1.amountSubtraction(Operand2);
        assertEquals (expRes, result, "Wrong subtraction result");
    }
    @Test
    void testAmountSubtractionNZeorRes() {
        int amountOfOperand1 = 20;
        int amountOfOperand2 = -20;
        Amount Operand1 = new Amount (amountOfOperand1, "SEK");
        Amount Operand2 = new Amount (amountOfOperand2, "SEK");

        int expRes = amountOfOperand1 - amountOfOperand2;
        int result = Operand1.amountSubtraction(Operand2);
        assertEquals (expRes, result, "Wrong subtraction result");
    }

    @Test
    public void toStringPositiveAmt() {
        int representedAmt = 10;
        Amount amount = new Amount(representedAmt, "SEK");
       String result = amount.toString();
       assertEquals("10 SEK", result);
              }

    @Test
    public void toStringNegativeAmt() {
        int representedAmt = -10;
        Amount amount = new Amount(representedAmt, "SEK");
        String result = amount.toString();
        assertEquals("-10 SEK", result);
    }
    @Test
    public void toStringZeroAmt() {
        int representedAmt = 0;
        Amount amount = new Amount(representedAmt, "SEK");
        String result = amount.toString();
        assertEquals("0 SEK", result);
    }
}
