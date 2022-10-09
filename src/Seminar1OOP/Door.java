package Seminar1OOP;

public class Door extends BaseState{

    public Door() {
        super.off();
        super.on();
        super.state = false;
    }
    public boolean getState() {
        return super.state;
    }
}
