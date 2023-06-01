package day2.opgame.service;

public interface IOperator {
    void setA(int a);

    void setB(int b);

    void generateQuestion(int max);

    String getQeustionMsg();

    boolean isEquals(int answer);

}
