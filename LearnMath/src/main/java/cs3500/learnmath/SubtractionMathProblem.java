package cs3500.learnmath;

import java.util.Random;

public class SubtractionMathProblem extends MathProblem {
    public SubtractionMathProblem(int opA, int opB) {
        super(opA, opB);
    }

    public int getAnswer() {
        return operandA - operandB;
    }

    public char getOperatorCharacter() {
        return '-';
    }

    public static SubtractionMathProblem getRandomSubtractionMathProblem() {
        Random rand = new Random();
        int firstNum = rand.nextInt() % 10;
        int secondNum = rand.nextInt(firstNum);
        return new SubtractionMathProblem(firstNum, secondNum);
    }
}
