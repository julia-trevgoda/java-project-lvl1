package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {

    private static final int MAX_INDEX_MISSED_NUM = 8;
    private static final int MAX_START_NUM = 5;
    private static final int MAX_PROGRESSION_STEP = 4;
    private static final int MIN_RANDOM_NUM = 1;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_COUNT_QUESTIONS = 3;
    private static final String[][] PLAY_PROGRESSION = new String[Engine.GAME_ARRAY_LENGTH][];
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public static void getPlayProgression() {
        for (int i = 0; i < MAX_COUNT_QUESTIONS; i++) {
            int indexOfMissedNum = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_INDEX_MISSED_NUM);
            int currentNum = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_START_NUM);
            int stepOfProgression = Utils.getRandomNumber(MIN_RANDOM_NUM, MAX_PROGRESSION_STEP);
            int missedNum = 0;

            StringBuilder progression = new StringBuilder();
            progression.append(currentNum + " ");

            for (int j = 1; j < PROGRESSION_LENGTH; j++) {
                currentNum += stepOfProgression;
                if (j == indexOfMissedNum) {
                    progression.append(".. ");
                    missedNum = currentNum;
                } else {
                    progression.append(currentNum + " ");
                }
            }
            PLAY_PROGRESSION[i] = new String[] {progression.toString().trim(), Integer.toString(missedNum)};
        }
        Engine.playGame(PLAY_PROGRESSION, GAME_DESCRIPTION);
    }
}
