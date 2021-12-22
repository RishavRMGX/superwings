export class Even{

    evenNumberChecker(num: number): Boolean {    
        if(num==null) return null;
        if(num%2==0) return true;
        return false;
    }
}