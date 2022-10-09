package Seminar1OOP;

public class Engine {

    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Двигатель запущен!");
    }

    public void stop() {
        this.work = false;
        System.out.println("Двигатель остановлен!");
    }

    public void throttleUp(int level) {
        if (this.work) {
            System.out.println("Дросель открыт %d" + level);
        }
    }

    public Boolean getWork() {
        return work;
    }
}
