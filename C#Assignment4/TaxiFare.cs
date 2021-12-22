public class TaxiFare {
    public double getFare(double? distance)
    {
        if(distance==null||distance<=0){
            return -1;
        }

        double dist = (double) distance;
        
        if(distance<=2) return 50.00;
        if(distance<=5) return dist*20;
        if(distance<=15) return (5*20)+((dist-5)*18);
        return (5*20)+(10*18)+((dist-15)*15);  
        
    }
}