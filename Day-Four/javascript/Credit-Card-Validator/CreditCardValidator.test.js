const { getCardType, getCardLength, isValid } = require("./CreditCardValidator")

test("Test that cardNumber starting with 4 returns visa card", ()=> {

    let actual = getCardType(4388576018402626);
    let expected = "Visa Card";
    
    expect(actual).toEqual(expected);
})

test("Test that cardNumber starting with 5 returns MasterCard", ()=> {

    let actual = getCardType(5388576018402626);
    let expected = "MasterCard";
    
    expect(actual).toEqual(expected);
})

test("Test that cardNumber starting with 37 returns Amercan Express Card", ()=> {

    let actual = getCardType(3788576018402626);
    let expected = "American Express Card";
    
    expect(actual).toEqual(expected);
})

test("Test that cardNumber starting with 6 returns Discover Card", ()=> {

    let actual = getCardType(6388576018402626);
    let expected = "Discover Card";
    
    expect(actual).toEqual(expected);
})

test("Test that cardNumber starting with any other number returns Invslid Card", ()=> {

    let actual = getCardType(2388576018402626);
    let expected = "Invalid card";
    
    expect(actual).toEqual(expected);
})

test("Test that getCardLenngth Gets cardlength ", ()=> {

    let actual = getCardLength(4388576018402626);
    
    expect(actual).toEqual(16)
})

test("Test that valid ccard number returns 'Valid'", ()=> {

    let actual = isValid(4388576018410707);
    let expected = "Valid";
    
    expect(actual).toEqual(expected);
})

test("Test that invalid ccard number returns 'Invalid'", ()=> {

    let actual = isValid(4388576018402626);
    let expected = "Invalid";
    
    expect(actual).toEqual(expected);
})


