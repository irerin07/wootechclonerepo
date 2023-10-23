package baseball.input;

import baseball.property.BaseballGameProperty;
import camp.nextstep.edu.missionutils.Console;

/**
 * @author 민경수
 * @description user number input reader
 * @since 2023.10.23
 **********************************************************************************************************************/
public class UserNumberInputReader implements NumberInputReader {

    private BaseballGameProperty baseballGameProperty;

    public UserNumberInputReader(BaseballGameProperty baseballGameProperty) {
        this.baseballGameProperty = baseballGameProperty;
    }

    @Override
    public int[] readInput() {
        return convertToIntArray(Console.readLine());
    }

    @Override
    public int readRestartChoiceInput() {
        return Integer.parseInt(Console.readLine());
    }

    private int[] convertToIntArray(String number) {
        int[] result = new int[baseballGameProperty.digit()];

        String trimInput = number.trim();
        char[] userInputs = trimInput.toCharArray();

        for (int i = 0; i < baseballGameProperty.digit(); i++) {
            result[i] = userInputs[i] - '0';
        }

        return result;
    }

}