package Seminar1OOP;

public class Conditioner extends BaseState{
    public Conditioner() {
        super.off();
        super.on();
        super.state = false;
    }
    public boolean getState() {
        return super.state;
    }
}
