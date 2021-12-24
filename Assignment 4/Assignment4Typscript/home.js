"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var TaxiFare_1 = require("./TaxiFare");
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var taxiFare = new TaxiFare_1.TaxiFare();
rl.question('Please enter total distance traveled. (In Km only)', function (traveled) {
    var fare = taxiFare.getFare(+traveled);
    if (fare > 0)
        console.log("Total Fare for distance " + traveled + " Km traveled : " + fare + "Rs");
    else
        console.log("Invalid Distance");
    rl.close();
});
