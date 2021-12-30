public class LeapYearChecker {

    public Boolean checkLeapYear(Integer year) {
        if(year==null) return null;
        if(year%4==0) {
            if(year%100==0){
                if(year%400==0)return true;
                return false;
            }
            return true;
        }
        return false;
    }
}
