package Seminar1OOP;

public class Wheel extends BaseState{
    public Wheel() {
        super.off();
        super.on();
        super.state = false;
    }

    public boolean getRotate() {
        return super.state;
    }

}
