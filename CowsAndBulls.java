/*
 * CowsAndBulls implements the logic for a cows and bulls guessing game the player has
 * Author: Awonke Mnotoza
 * Student number: MNTAWO002
 * Date: 14 September
 */

public class CowsAndBulls {
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;

    private NumberPicker numberPicker;
    static int generatedNumber;
    int guessedNumber;
    int maxGuess = MAX_GUESSES;

    // ^ Create a CowsAndBulls game using the given randomisation seed value to
    // generate
    public CowsAndBulls(int seed) {
        numberPicker = new NumberPicker(seed, 1, 9);
        generatedNumber = numberPicker.nextInt();
        for (int i = 0; i < NUM_DIGITS - 1; i++) {
            generatedNumber = generatedNumber * 10;
            generatedNumber = generatedNumber + numberPicker.nextInt();
        }
    }

    // ^ Obtain the number of guesses remaining.
    public int guessesRemaining() {
        return this.maxGuess;
    }

    public Result guess(int guessNumber) {
        this.guessedNumber = guessNumber;
        int bulls = NumberUtils.countMatches(this.guessedNumber, generatedNumber);
        int cows = NumberUtils.countIntersect(this.guessedNumber, generatedNumber);
        this.maxGuess = this.maxGuess - 1;

        return new Result(cows, bulls);
    }

    // ^ End the game, returning the secretNumber
    public int giveUp() {
        return generatedNumber;
    }

    // ^ Return true or false if the number has been guessed or there are no more
    // guesses left
    public boolean gameOver() {
        if ((guessedNumber == generatedNumber) || (maxGuess == 0)) {
            return true;
        }
        return false;
    }

}
