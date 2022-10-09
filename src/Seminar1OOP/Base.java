package Seminar1OOP;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Door doorLeft1;
    private Door doorLeft2;
    private Door doorRight1;
    private Door doorRight2;
    private Door doorBack;
    private Conditioner conditioner;

    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        doorBack = new Door();
        doorLeft2 = new Door();
        doorLeft1 = new Door();
        doorRight1 = new Door();
        doorRight2 = new Door();
        conditioner = new Conditioner();
        transmission = new Transmission();
    }

    public void drive() {
        if (engine.getWork()) {
            transmission.switchGear(1);
            wheel4.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel1.rotate();
        }
    }

    public void openDoor() {
        if(doorRight2.getState()) {
            doorRight2.off();
            System.out.println("Дверь закрыта");
        } else {
            doorRight2.on();
            System.out.println("Дверь открыта");
        }
    }
    public void power() {
        if (!(engine.getWork())) {
            engine.on();
            System.out.println("Двигатель запущен");
        } else {
            engine.off();
            System.out.println("Двигатель выключен");
        }
    }

}
