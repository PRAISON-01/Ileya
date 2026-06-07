
import java.util.Arrays;
public class CreditCardValidator{

    public static String getCardType(String cardNumber){
        if((cardNumber.length() < 13)|| (cardNumber.length() > 16)){
            return "Invalid card";
        }

        if(cardNumber.startsWith("4")){
            return "Visa Card";
        }
        else if(cardNumber.startsWith("5")){
            return "MasterCard";
        }
        else if (cardNumber.startsWith("37")){
            return "American Express Card";
        }
        else if(cardNumber.startsWith("6")){
            return "Discover Card";
        }

        return "Invalid card";
    }

    public static int getCardLength(String cardLength){
        int size = cardLength.length();
        return size;
    }

    public static boolean isValid(String cardNumber){

        int newCardNumber = String.parseInt(cardNumber);
        total = 0;
        validTotal = 0;
        oddTotal = 0
        card

    }



}



//import java.util.Arrays;
//public class CreditCardValidator{
//
//    public static int getCardLength(long cardNumber){
//        int length = 0;
//        long countNumber = cardNumber;
//        while(countNumber > 0){
//            countNumber /= 10;
//            length++;
//        }
//
//        return length;
//    }
//
//    public static String getCardType(long cardNumber){
//        long firstDigit  = cardNumber;
//        while(firstDigit >= 10){
//            firstDigit /= 10;
//        }
//
//        long firstTwoDigit = cardNumber;
//        while(firstTwoDigit >= 100){
//            firstTwoDigit /= 10;
//        }
//
//        if(firstTwoDigit == 37){
//            return "American Express Card";
//        }
//        else if(firstDigit == 5){
//            return "Master Card";
//        }
//        else if(firstDigit == 4){
//            return "Visa Card";
//        }
//        else if(firstDigit == 6){
//            return "Discover Card";
//        }
//
//        return "Invalid Card!!!";
//    }
//
//    public static int[] isValid(long cardNumber){
//
//        String newCardNumber = cardNumber + "";
//
//    }
//}
