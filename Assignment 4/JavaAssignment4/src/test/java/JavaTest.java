import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaTest {

    @Test
    void checkValidity(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting invalid negative distance
        Assertions.assertTrue(taxiFare.getFareForDistance(-10f)<0);
    }

    @Test
    void checkWithNull(){
        TaxiFare taxiFare = new TaxiFare();
        Float check = null;
        //Inserting null distance
        Assertions.assertTrue(taxiFare.getFareForDistance(check)<0);
    }

    @Test
    void checkForLessThenTwoKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less then 2 km
        Assertions.assertEquals(taxiFare.getFareForDistance(1.5f),50);
    }

    @Test
    void checkForLessThenFiveKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less than 5 km
        float distance = 4.5f;
        float result = distance*20;
        Assertions.assertEquals(taxiFare.getFareForDistance(distance),result);
    }

    @Test
    void checkForLessThenFifteenKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less than 15 km and greater than 5
        float distance = 14.5f;
        float result = (5*20)+(distance-5)*18;
        Assertions.assertEquals(taxiFare.getFareForDistance(distance),result);
    }

    @Test
    void checkForGreaterThenFifteenKm(){
        TaxiFare taxiFare = new TaxiFare();

        //Inserting distance less than 15 km and greater than 5
        float distance = 24.5f;
        float result = (5*20)+10*18+(distance-15)*15;
        Assertions.assertEquals(taxiFare.getFareForDistance(distance),result);
    }
}
