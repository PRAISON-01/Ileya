const { getSubTotal, getRate, getDiscount, getVat, getBillTotal, getChange } = require("./CheckOutFunction")

test("Test that get subtotal returns subtotal of the prices", ()=> {

    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]
    let actual = getSubTotal(itemPriceList)
    let expected = 22500.0
    
    expect(actual).toEqual(expected)

})
test("Test that get rate returns rate in percentage ", ()=> {
    
    let rate = 8;
    let actual = getRate(rate)
    let expected = 0.08
    
    expect(actual).toEqual(expected)
})

test("Test that get Disount returns total price after applying rate ", ()=> {

    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]
    let rate = 8
    let actual = getDiscount(itemPriceList, rate)
    let expected = 1800.0
    
    expect(actual).toEqual(expected)
})

test("Test that get vat returnd the prices after appplying value add tax ", ()=> {
    
    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]
    let vat = getVat(itemPriceList)
    let expected = 3937
    expect(vat).toEqual(expected)

})

test("Test that  get bill total returns total bill ", ()=> {

    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]  
    let rate = 8
    let actual = getBillTotal(itemPriceList, rate)
    let expected = 24637

    expect(actual).toEqual(expected)
})


test("Test that get  change returnd difference when total is greater ", ()=> {
    
    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]
    let rate = 8
    let deposit = 20000
    let actual = getChange(deposit, itemPriceList, rate)
    let expected = 4637

    expect(actual).toEqual(expected);
})

test("Test that get  change returnd difference when total is lesser ", ()=> {
    
    let itemPriceList = [5000.00, 12500.00, 3200.00, 1800.00]
    let rate = 8
    let deposit = 30000
    let actual = getChange(deposit, itemPriceList, rate)
    let expected = 5363

    expect(actual).toEqual(expected);
})

