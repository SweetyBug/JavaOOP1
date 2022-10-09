package Seminar1OOP;

public class Transmission {

    private int gearNum = 0;

    public int getGearNum() {
        return gearNum;
    }

    public void switchGear(int num) {
        this.gearNum = num;
        System.out.println("Переключение произошло на " + num + " передачу");
    }
}
