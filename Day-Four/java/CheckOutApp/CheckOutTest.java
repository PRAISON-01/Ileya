import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutTest{

    @Test
    public void testThatGetSUbTotalReturnsSubtotal(){
        double[] itemPriceList = {5000.00, 12500.00, 3200.00, 1800.00};
        double actual = CheckOutFunction.getSubTotal(itemPriceList);
        double expected = 22500.0;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatGetRateReturnsRateInDouble(){
        int rate= 8;
        double actual = CheckOutFunction.getRate(rate);
        double expected = 0.08;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatGetDiscountReturnsTheDiscountRate(){
        double[] itemPriceList = {5000.00, 12500.00, 3200.00, 1800.00};
        double actual = CheckOutFunction.getDiscount(8, itemPriceList);
        double expected = 1800.0;
        assertEquals(actual, expected);
        
    }

    @Test
    public void testThatGetVatReturnsThevalueAddedTaxappliedOnTheSubTotal(){
        double[] itemPriceList = {5000.00, 12500.00, 3200.00, 1800.00};
        double actual = CheckOutFunction.getVat(itemPriceList);
        double expected = 3937.0;
        assertEquals(actual, expected);
        
    }

    @Test
    public void testThatBillTptalReturnsBillTotal(){
        double[] itemPriceList = {5000.00, 12500.00, 3200.00, 1800.00};
        double actual = CheckOutFunction.getBillTotal(itemPriceList, 8);
        double expected = 24637.0;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatBillTptalReturnsBillTotal(){
        double[] itemPriceList = {5000.00, 12500.00, 3200.00, 1800.00};
        double actual = CheckOutFunction.getChange(20000, itemPriceList, 8);
        double expected = 4637.0;
        assertEquals(actual, expected);
    }



}
