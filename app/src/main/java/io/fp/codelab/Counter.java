package io.fp.codelab;

public class Counter {

    private int counter = 0;
    private int initValue = 0;
    private int stepSize = 1;

    public Counter() {

    }

    public Counter(int initValue, int stepSize, int currentValue) {
        this.counter = currentValue;
        this.initValue = initValue;
        this.stepSize = stepSize;
    }

    public int getInitValue() {
        return initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }

    public int getStepSize() {
        return stepSize;
    }

    public void setStepSize(int stepSize) {
        this.stepSize = stepSize;
    }

    public void increaseCounter() {
        //TODO increase counter value by step size.
    }

    public int getCounter() {
        return counter;
    }

    public void initialize() {
        //TODO inititialize counter with initial value.
    }
}
