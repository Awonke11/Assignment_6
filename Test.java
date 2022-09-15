import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int number = 1234567;
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

        for (int num : reversedNumbersList) {
            System.out.println(num);
        }
    }
}
