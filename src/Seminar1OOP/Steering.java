package Seminar1OOP;

public class Steering {

    private String position = "Прямо";
    public void turn(String pos) {
        this.position = pos;
        System.out.println("Руль направлен " + pos);
    }
}
