import java.util.Arrays;

class arrays {
    public static void main(String args[]){
        int integers[] = {12,2,52,10};
        int startingIndex = 1;
        int endingIndex = 4;
        int key = '2';
        int copyOfIntegers[] = Arrays.copyOf(integers, integers.length); //literally create a copy, not a pointer


        int foundItemIndex1 = Arrays.binarySearch(integers, key); //search for the 'key'
        System.out.println(foundItemIndex1);

        Arrays.sort(integers, startingIndex, endingIndex); //sorting an array
        int foundItemIndex2 = Arrays.binarySearch(integers, key);

        Arrays.fill(integers, startingIndex, endingIndex, 'x'); //replacing or filling the array

        System.out.println(Arrays.toString(integers));
        System.out.println(foundItemIndex2);
        System.out.println(copyOfIntegers);
    }
}
