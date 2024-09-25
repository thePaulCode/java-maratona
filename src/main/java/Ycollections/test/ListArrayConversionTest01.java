package Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println(numbers);

        Integer[] listToArray = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numberArray = new Integer[3];
        numberArray[0] = 10;
        numberArray[1] = 20;
        numberArray[2] = 30;

        List<Integer> arrayToList = Arrays.asList(numberArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numberArray));
        System.out.println(arrayToList);

        System.out.println("--------------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numberArray));
        numbersList.add(21);
        System.out.println(numbersList);



    }
}
