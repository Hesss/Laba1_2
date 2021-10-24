package ru.codeinside.lessons.javacore.inheritance;

public class VehicleDemo {
    public static void main(String[] args) {
        Car teslaModelX = new Car(2020, "black", true, true);
        Truck mercedesBenzActors = new Truck(2013, "white", false);

        System.out.println(teslaModelX.getVehicleInfo());
        System.out.println(mercedesBenzActors.getVehicleInfo());
    }
}
