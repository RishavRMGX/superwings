import * as readline from 'readline';

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Please enter total distance traveled. (In Km only)', (traveled) => {
    var fare: number = getFare(+traveled) 
    if(fare>0) console.log("Total Fare for distance "+ traveled + " Km traveled : " + fare + "Rs"); 
    else console.log("Invalid Distance");
  rl.close();
});


function getFare(distance: number) { 
    const first_five_km = 5 * 20
    const ten_km_after_first_five = 10 * 18

    if (distance<0) {
        return -1;
    } else if (distance<=2) {
        return 50.0
    }else if (distance<=5) {
        return distance*20
    }else if (distance<=15) {
        return first_five_km + (distance - 5) * 18
    }else {
        return first_five_km + ten_km_after_first_five + (distance - 15) * 15
    }
}