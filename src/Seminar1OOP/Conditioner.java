package Seminar1OOP;

public class Conditioner {
    enum State{
        On, Off
    }
    private State state;
    public void state() {
        if(state == State.Off) {
            state = State.On;
            System.out.println("Кондиционер включен");
        } else {
            System.out.println("Кондиционер выключен");
        }
    }
}
