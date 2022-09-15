import java.util.ArrayList;

/*
 * The NumberUtils class contains a collection of routines for working with integers.
 * Author: Awonke Mnotoza
 * Student number: MNTAWO002
 * Date: 14 September 2022
 */
public class NumberUtils {

    private NumberUtils() {
    }

    // ^ Given a number that is n digits in length, maps the digits to an array
    // length n.
    public static int[] toArray(int number) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        while (true) {
            int num = number % 10;
            numbersList.add(num);
            if (number < 10) {
                break;
            }
            number = (number - num) / 10;
        }

        int[] reversedNumbersList = new int[numbersList.size()];
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            reversedNumbersList[(numbersList.size() - i) - 1] = numbersList.get(i);
        }

        return reversedNumbersList;
    }

    // ^ Given two numbers, count the quantity of matching digits
    // ^ those with the same value and position
    public static int countMatches(int numberA, int numberB) {
        int[] numbersAList = toArray(numberA);
        int[] numbersBList = toArray(numberB);

        int counter = 0;
        for (int i = 0; i < numbersAList.length; i++) {
            if (numbersAList[i] == numbersBList[i]) {
                counter++;
            }
        }

        return counter;
    }

    // ^ Count the quantity of digits that two numbers have in common, regardless of
    // position
    public static int countIntersect(int numberA, int numberB) {
        int[] numbersAList = toArray(numberA);
        int[] numbersBList = toArray(numberB);

        int counter = 0;
        for (int i = 0; i < numbersAList.length; i++) {
            for (int j = 0; j < numbersBList.length; j++) {
                if (numbersAList[i] == numbersBList[j]) {
                    counter++;
                }
            }
        }

        return counter;
    }
}
