import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest{

    @Test
    public void testThatIfCardNumberStartsWith4ReturnsValid(){
        assertEquals("Visa Card",CreditCardValidator.getCardType("4388576018402626"));
    }

    @Test
    public void testThatIfCardNumberStartsWith5ReturnsValid(){
        assertEquals("MasterCard",CreditCardValidator.getCardType("5388576018402626"));
    }

    @Test
    public void testThatIfCardNumberStartsWith37ReturnsValid(){
        assertEquals("American Express Card",CreditCardValidator.getCardType("3788576018402626"));
    }

    @Test
    public void testThatIfLengthIsLessThan13orgreaterThan16(){
        assertEquals("Invalid card", CreditCardValidator.getCardType("43885760184"));
    }

    @Test
    public void testThatCardReturns16forA16DigitCardNumber(){
        assertEquals(16, CreditCardValidator.getCardLength("4388576018402626") );
    }


}
