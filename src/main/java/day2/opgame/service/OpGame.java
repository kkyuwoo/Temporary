package day2.opgame.service;

public class OpGame {
    int remainingAnswers;
    String cheeringUpMsg = "한 번 더 해보자";
    IOperator op;

    public OpGame(IOperator op) {
        this.op = op;
    }

    public void makeQuestion() {
        remainingAnswers = 3;
        op.setA(1);
        op.setB(1);
    }

    public void makeQuestion(int max) {
        op.generateQuestion(max);
    }

    public String getQuestion() {
        return op.getQeustionMsg();
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return op.isEquals(answer);
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }
}
