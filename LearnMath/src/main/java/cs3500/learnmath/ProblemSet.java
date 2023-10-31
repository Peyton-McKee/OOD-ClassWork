package cs3500.learnmath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ProblemSet {
    private final ArrayList<MathProblem> problemSet = new ArrayList<>();

    /**
     * Generate a set of math problems
     *
     * @param countToGenerate the number of problems to generate
     */
    public void generateProblems(int countToGenerate) {
        for (int i = 0; i < countToGenerate; i++) {
            MathProblem newProblem = generateRandomProblem();
            this.problemSet.add(newProblem);
        }
    }

    private MathProblem generateRandomProblem() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return AdditionMathProblem.getRandomAdditionMathProblem();
        } else {
            return SubtractionMathProblem.getRandomSubtractionMathProblem();
        }
    }

    public ArrayList<MathProblem> getProblemSet() {
        return problemSet;
    }
}
