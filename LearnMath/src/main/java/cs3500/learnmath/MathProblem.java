package cs3500.learnmath;

public abstract class MathProblem {
    protected int operandA = 0;
    protected int operandB = 0;

    public MathProblem(int opA, int opB) {
        operandA = opA;
        operandB = opB;
    }

    public abstract int getAnswer();

    public abstract char getOperatorCharacter();

    public int getOperandA() {
        return operandA;
    }

    public int getOperandB() {
        return operandB;
    }

    public String toString() {
        return "[" + operandA + getOperatorCharacter() + operandB + "=" + getAnswer() + "]";
    }
}
