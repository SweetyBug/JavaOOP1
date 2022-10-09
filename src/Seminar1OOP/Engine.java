package Seminar1OOP;

public class Engine extends BaseState{

    public Engine() {
        super.off();
        super.on();
        super.state = false;
    }
    public void throttleUp(int level) {
        if (super.state) {
            System.out.println("Дросель открыт %d" + level);
        }
    }

    public Boolean getWork() {
        return super.state;
    }
}
