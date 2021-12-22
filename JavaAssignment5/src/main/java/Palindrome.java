public class Palindrome {

    Boolean palindromeChecker(String input){
        if(input==null) return null;
        String[] splitInputList = input.split("");
        for (int i=0; i< splitInputList.length; i++){
            if(!splitInputList[i].equals(splitInputList[splitInputList.length-(i+1)])) return false;
        }
        return true;
    }
}
