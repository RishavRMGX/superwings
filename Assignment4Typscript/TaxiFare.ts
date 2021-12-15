export class TaxiFare{
    
    first_five_km = 5 * 20;
    ten_km_after_first_five = 10 * 18;

    getFare(distance: number): number {    
        if (distance==null||distance<=0) {
            return -1;
        } else if (distance<=2) {
            return 50.0
        }else if (distance<=5) {
            return distance*20
        }else if (distance<=15) {
            return this.first_five_km + (distance - 5) * 18
        }else {
            return this.first_five_km + this.ten_km_after_first_five + (distance - 15) * 15
        }
    }
}