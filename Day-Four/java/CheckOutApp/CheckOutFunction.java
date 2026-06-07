public class CheckOutFunction{


    public static double getSubTotal(double[] itemPriceList){

        double subTotal = 0.0;
        for(double price : itemPriceList){
            subTotal += price;
        }

        return subTotal;
    }

    public static double getRate(int rate){
        double rateP = rate * 0.01;

        return rateP;
    }

    public static double getDiscount(int rate, double[] itemPriceList){

        double subTotal = getSubTotal(itemPriceList);
        double rateP = getRate(rate);
        double discount = subTotal * rateP;

        return discount;
    }

    public static double getVat(double[] itemPriceList){
        double subTotal = getSubTotal(itemPriceList);
        double vat = subTotal * 0.175;
        vat = Math.round(vat);

        return vat;
    }

    public static double getBillTotal(double[] itemPriceList, int rate){

        double subTotal = getSubTotal(itemPriceList);
        double discount = getDiscount(rate, itemPriceList);
        double vat = getVat(itemPriceList);
        double totalBill = subTotal - discount + vat;
        return totalBill;
    }

    public static double getChange(double deposit, double[] itemPriceList, int rate){
        double change = 0.0;
        double totalBill = getBillTotal(itemPriceList, rate);
        if (totalBill > deposit){
            change = totalBill - deposit;
        }
        else{
            change = deposit - totalBill;
        }
    }





//End of class FIle
}
