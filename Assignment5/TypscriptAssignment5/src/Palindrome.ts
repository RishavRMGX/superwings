export class Palindrome{
    palindromeChecker(input: string): Boolean{
        var splitInputList = input.split("");
        for (var i=0; i< splitInputList.length; i++){
            if(splitInputList[i] !== splitInputList[splitInputList.length-(i+1)]) return false;
        }
        return true;
    }
}