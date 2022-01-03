export class Median{

    medianFinder(arrayInput: number[]): number {   
        var size =arrayInput.length 
        var sortedArray: number[] = arrayInput.sort((n1,n2) => n1 - n2);
        var position = Math.ceil(size/2)
        return sortedArray[position-1];
    }
}