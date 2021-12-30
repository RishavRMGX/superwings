import java.util.Arrays;

public class MedianFinder {
    public Float medianFinder(Float[] arrayInput, Integer size) {
        if(arrayInput==null || size == null) return null;
        Arrays.sort(arrayInput);
        int position= (int) Math.ceil((double)size/2);
        return arrayInput[position-1];
    }
}
