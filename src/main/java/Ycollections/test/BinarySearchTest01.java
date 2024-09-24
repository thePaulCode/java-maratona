package Ycollections.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 0, 3, 6);

        // -(inserction point) -1
        // index 0, 1, 2, 3
        // values 0, 2, 3, 4

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 7));
    }
}
