package cs3500.learnmath;

import java.util.List;

public class MathGameController {
    private ProblemSet problemSet;
    private MathGamePlayView view;

    public MathGameController() {
        problemSet = new ProblemSet();
        view = new MathGamePlayView();
        problemSet.generateProblems(3);
    }

    public void runGame() {
        List<MathProblem> problems = problemSet.getProblemSet();
        view.showPreface("\n\n Welecome to math game. Answer the questions that follow. \n");

        for (MathProblem p : problems) {
            view.showProblem("What is the asnwer to this problem\n", p);
            int actualAnswer = view.getUserIntegerResponse("\n --> ");
            int expectedAnswer = p.getAnswer();
        }
    }
}
