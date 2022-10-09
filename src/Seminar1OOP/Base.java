package Seminar1OOP;

public class Base {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Door doorLeft1;
    private Door doorLeft2;
    private Door doorRight1;
    private Door doorRight2;
    private Door doorBack;
    private Transmission transmission;
    private Conditioner conditioner;
    private Steering steering;
    public String left = "налево";
    public String right = "направо";
    public String straight = "прямо";
    public Base() {
        engine = new Engine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        doorRight2 = new Door();
        doorRight1 = new Door();
        doorLeft2 = new Door();
        doorLeft1 = new Door();
        doorBack = new Door();
        conditioner = new Conditioner();
        transmission = new Transmission();
        steering = new Steering();
    }
    public void powerConditioner(){
        if(conditioner.getState()){
            conditioner.off();
            System.out.println("Кондицинер выключен");
        } else {
            conditioner.off();
            System.out.println("кондиционер выключен");
        }
    }
    public void wheels(boolean n) {
        if (n) {
            wheel1.on();
            wheel2.on();
            wheel3.on();
            wheel4.on();
            System.out.println("Машина в движении");
        } else {
            wheel1.off();
            wheel2.off();
            wheel3.off();
            wheel4.off();
            System.out.println("Машина остановлена");
        }
    }
    public void drive() {
        int gearNum = transmission.getGearNum();
        if (engine.getWork()) {
            if(gearNum == 0) {
                wheels(engine.getWork());
                transmission.switchGear(gearNum+1);
            } else if (gearNum > 0 && gearNum < 5){
                transmission.switchGear(gearNum+1);
            } else {
                wheels(engine.getWork());
            }
        }
    }
    public void blockDoor(){
        doorRight2.off();
        doorRight1.off();
        doorLeft1.off();
        doorLeft2.off();
        System.out.println("Двери заблокированы");
    }
    public void unblockDoor() {
        doorRight2.on();
        doorRight1.on();
        doorLeft1.on();
        doorLeft2.on();
        System.out.println("Двери разблокированы");
    }
    public void power() {
        if (!(engine.getWork())) {
            engine.on();
            System.out.println("Двигатель запущен");
        } else {
            engine.off();
            System.out.println("Двигатель выключен");
            if (wheel1.getRotate()){
                wheels(engine.getWork());
            }
        }
    }
    public void unDrive() {
        int gearNum = transmission.getGearNum();
        if(engine.getWork() && gearNum !=0) {
            transmission.switchGear(gearNum-1);
        } else if (engine.getWork() && gearNum == 0){
            wheels(false);
        }
    }

    public void steeringPosition(String s) {
        steering.turn(s);
    }
}
