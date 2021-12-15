public class TaxiFare {
    public Float getFareForDistance(float distance) {
        int firstFiveKm = 5 * 20;
        int tenKmAfterFirstFive = 10 * 18;
        if(distance<0) return -1f;
        if(distance <= 2) return 50.0f;
        else if(distance <= 5) return distance * 20;
        else if(distance <= 15) return  firstFiveKm + (distance-5) * 18;
        else return firstFiveKm + tenKmAfterFirstFive + (distance - 15) * 15;
    }
}
