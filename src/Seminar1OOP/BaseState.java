package Seminar1OOP;

public class BaseState {

    protected boolean state;

    protected void off() {
        this.state = false;
    }

    protected void on() {
        this.state = true;
    }

}
