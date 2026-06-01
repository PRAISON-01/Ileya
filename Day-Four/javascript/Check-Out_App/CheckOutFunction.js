function getSubTotal(itemPriceList){

    let subTotal = 0.0
    for(let price of itemPriceList){
        subTotal += price
    
    }
    return subTotal
}

module.exports = { getSubTotal }

function getRate(rate){

    let ratep = rate/100
    return ratep    
}

module.exports = { getSubTotal, getRate}

function getDiscount(itemPriceList, rate){

    let subTotal = getSubTotal(itemPriceList)
    rate = getRate(rate)
    let discount = subTotal * rate 
    
    return discount
}
module.exports = { getSubTotal, getRate, getDiscount}

function getVat(itemPriceList){

    let subTotal = getSubTotal(itemPriceList)
    let vat = subTotal * 0.175
    vat = Math.round(vat, 2)

    return vat
}

module.exports = { getSubTotal, getRate, getDiscount, getVat}

function getBillTotal(itemPriceList, discountRate){

    let subTotal = getSubTotal(itemPriceList)

    let discount = getDiscount(itemPriceList, discountRate)

    let vat = getVat(itemPriceList)
    let totalBill = subTotal - discount + vat
    return totalBill
}

module.exports = { getSubTotal, getRate, getDiscount, getVat, getBillTotal}

function getChange(deposit, itemPriceList, discountRate){
    let change = 0
    let totalBill = getBillTotal(itemPriceList, discountRate)
    if (totalBill > deposit){
        change = totalBill - deposit
    }
    
    else{
        change = deposit - totalBill
    }
    return change;
}

module.exports = { getSubTotal, getRate, getDiscount, getVat, getBillTotal, getChange }

