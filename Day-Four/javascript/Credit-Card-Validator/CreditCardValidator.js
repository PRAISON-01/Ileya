//funitons

function getCardType(cardNumber){

    let cardType = String(cardNumber)
    if (cardType.startsWith("4")){
        return "Visa Card";
    }
    else if (cardType.startsWith("5")){
        return "MasterCard";
    }
    else if(cardType.startsWith("37")){
        return "American Express Card";
    }
    else if(cardType.startsWith("6")){
        return "Discover Card";
    }
    return "Invalid card";
}

module.exports = {getCardType}

function getCardLength(cardNumber){

    let cardType = String(cardNumber);
    let count = 0;
    for(let letters of cardType){
        count+= 1;
    }
    return count;
}


module.exports = { getCardType, getCardLength };

function isValid(cardNumber){
    let cardType = String(cardNumber);
    let numbers = []
    let total = 0
    let digit = 0
    let sum = 0
    let new_sum = 0
    const size = cardType.length;

    for(let count = size - 2; count >= 0; count -= 2 ){
        numbers.push(Number(cardType[count]) * 2);
    }
    
    
    for(let number of numbers){
        if(number > 9){
            let firstDigit = Math.trunc(number / 10);
            let secondDigit = number % 10;
            total += firstDigit + secondDigit;
        }
        else{
            total += number
        }
    }

    for(let count = size - 1; count >= 0; count -= 2){
        
        let number = cardType[count]
        sum += Number(number)
    }
    new_sum = sum + total;

    if(new_sum % 10 ==  0){
        return "Valid";
    }
return "Invalid"
}

module.exports = { getCardType, getCardLength, isValid  };
