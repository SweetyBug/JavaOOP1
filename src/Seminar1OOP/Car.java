package Seminar1OOP;

public class Car {
    public static void main(String[] args) {
        Base car = new Base();
        car.unblockDoor();
        car.power();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.steeringPosition(car.left);
        car.steeringPosition(car.straight);
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.unDrive();
        car.steeringPosition(car.right);
        car.steeringPosition(car.straight);
        car.unDrive();
        car.unDrive();
        car.unDrive();
        car.unDrive();
        car.unDrive();
        car.power();
        car.blockDoor();
    }
}
