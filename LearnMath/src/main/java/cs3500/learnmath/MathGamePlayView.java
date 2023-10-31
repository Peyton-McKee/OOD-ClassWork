package cs3500.learnmath;

import java.util.Scanner;

public class MathGamePlayView {
    private Scanner input;

    public MathGamePlayView() {
        input = new Scanner(System.in);
    }

    public void showPreface(String prompt) {
        System.out.println(prompt);
    }

    public void showProblem(String prompt, MathProblem problem) {
        System.out.print(prompt);
        System.out.printf("%d %c %d = ___\n", problem.getOperandA(), problem.getOperatorCharacter(), problem.getOperandB());
    }

    public int getUserIntegerResponse(String prompt) {
        System.out.print(prompt);
        return input.nextInt();
    }
}
