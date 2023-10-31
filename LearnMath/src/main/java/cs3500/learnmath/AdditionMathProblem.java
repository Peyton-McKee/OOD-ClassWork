package cs3500.learnmath;

import java.util.Random;

public class AdditionMathProblem extends MathProblem {

    AdditionMathProblem(int opA, int opB) {
        super(opA, opB);
    }

    public int getAnswer() {
        return operandA + operandB;
    }

    public char getOperatorCharacter() {
        return '+';
    }

    public static AdditionMathProblem getRandomAdditionMathProblem() {
        Random rand = new Random();
        int operandA = rand.nextInt(10);
        int operandB = rand.nextInt(10);
        return new AdditionMathProblem(operandA, operandB);
    }

}
