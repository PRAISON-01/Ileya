const input = require("prompt-sync")();
const { getSubTotal, getRate, getDiscount, getVat, getBillTotal, getChange } = require("./CheckOutFunction")

const time = new Date().toLocaleString();

const name = input("What is the customer name => ");

const itemList = [];
const quantityList = [];
const priceList = [];

let isRunning = true;

while (isRunning) {
    const itemInput = input("What did the user buy? => ");
    itemList.push(itemInput);

    const quantityInput = Number(input("How many pieces? => "));
    quantityList.push(quantityInput);

    const priceInput = Number(input("How much per unit? => #"));
    priceList.push(priceInput);

    const addMore = input("Add more items? (yes/no)  ");

    if (addMore.toLowerCase() === "no") {
        isRunning = false;
    }
}

const cashier = input("Enter cashier name => ");
const rateInput = Number(input("How much discount will he get? => "));

const totalItemPrices = [];
for (let i = 0; i < itemList.length; i++) {
    totalItemPrices.push(priceList[i] * quantityList[i]);
}

const subTotal = getSubTotal(totalItemPrices);
const discount = getDiscount(totalItemPrices, rateInput);
const vat = getVat(totalItemPrices);
const billTotal = getBillTotal(totalItemPrices, rateInput);


console.log("\n\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 091-SEMI-0000");
console.log(`Date: ${time}`);
console.log(`Cashier: ${cashier}`);
console.log(`Customer Name: ${name}`);
console.log("============================================================");
console.log("                     ITEM    QTY     PRICE       TOTAL(NGN)");
console.log("============================================================");

for (let i = 0; i < itemList.length; i++) {
    let itemTotal = priceList[i] * quantityList[i];
    console.log(itemList[i] + "    " + quantityList[i] + "    " + priceList[i] + "    " + itemTotal);
}


console.log("\n============================================================");
console.log(`                                     Sub Total => ${subTotal.toFixed(2)}`);
console.log(`                                      Discount => ${discount.toFixed(2)}`);
console.log(`                                  VAT @ 17.50% => ${vat}`);
console.log("============================================================");
console.log(`                                    Bill Total => ${billTotal.toFixed(2)}`);
console.log("============================================================");
console.log(`THIS IS NOT A RECEIPT KINDLY PAY #${billTotal}`);
console.log("============================================================");

const paid = Number(input("How much did the customer give to you? => "));

const balance = getChange(paid, totalItemPrices, rateInput);

console.log("\n\nSEMICOLON STORES");
console.log("MAIN BRANCH");
console.log("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
console.log("TEL: 091-SEMI-0000");
console.log(`Date: ${time}`);
console.log(`Cashier: ${cashier}`);
console.log(`Customer Name: ${name}\n\n`);
console.log("============================================================");
console.log("                     ITEM    QTY     PRICE       TOTAL(NGN)");
console.log("============================================================");

for (let i = 0; i < itemList.length; i++) {
    let itemTotal = priceList[i] * quantityList[i];
    console.log(itemList[i] + "    " + quantityList[i] + "    " + priceList[i] + "    " + itemTotal);
}


console.log("\n============================================================");
console.log(`                                     Sub Total => ${subTotal.toFixed(2)}`);
console.log(`                                      Discount => ${discount.toFixed(2)}`);
console.log(`                                  VAT @ 17.50% => ${vat}`);
console.log("============================================================");
console.log(`                                    Bill Total => ${billTotal.toFixed(2)}`);
console.log(`                                   Amount Paid => ${paid.toFixed(2)}`);
console.log(`                                       Balance => ${balance.toFixed(2)}`);
console.log("============================================================");
console.log("                 THANK YOU FOR YOUR PATRONAGE                    ");
console.log("============================================================");

