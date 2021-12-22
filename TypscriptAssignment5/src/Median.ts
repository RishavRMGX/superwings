export class Median{

    medianFinder(arrayInput: number[], size: number): number {    
        if(arrayInput==null || size == null) return null;
        var sortedArray: number[] = arrayInput.sort((n1,n2) => n1 - n2);
        var position = Math.ceil(size/2)
        return sortedArray[position-1];
    }
}