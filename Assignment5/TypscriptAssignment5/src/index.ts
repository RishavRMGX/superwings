import * as readline from 'readline';
import { Even } from './Even';
import { LeapYear } from './LeapYear';
import { Median } from './Median';
import { Palindrome } from './Palindrome';

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let even =new Even();
rl.question('Enter number to check if its even.', (num) => {
    var evenCheckerResult: number = even.evenNumberChecker(+num) 
    if(evenCheckerResult==-1) console.log("Invalid Number");
    else if(evenCheckerResult == 1) console.log(num + " is Even Number"); 
    else if(evenCheckerResult == 0) console.log(num + " is not Even Number");
  rl.close();
});

let leapYear = new LeapYear();
rl.question('Enter year to check if its leap year.', (year) => {
    var leapYearCheckerResult: Boolean = leapYear.leapYearChecker(+year) 
    if(leapYearCheckerResult==null) console.log("Invalid Year");
    if(leapYearCheckerResult) console.log(year + " is Leap Year"); 
    else console.log("is not Leap Year");
  rl.close();
});

let median = new Median();
rl.question('Enter year to check if its leap year.', (year) => {
    var medianResult: number = median.medianFinder([1,2,3,4,5]) 
    if(medianResult==null) console.log("Invalid Year");
    console.log("Median is "+ medianResult);
  rl.close();
});
