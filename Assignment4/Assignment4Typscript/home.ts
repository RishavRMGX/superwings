import * as readline from 'readline';
import { TaxiFare } from './TaxiFare';

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
let taxiFare =new TaxiFare();
rl.question('Please enter total distance traveled. (In Km only)', (traveled) => {
    var fare: number = taxiFare.getFare(+traveled) 
    if(fare>0) console.log("Total Fare for distance "+ traveled + " Km traveled : " + fare + "Rs"); 
    else console.log("Invalid Distance");
  rl.close();
});



