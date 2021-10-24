package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

public class Car extends Vehicle {

    private boolean isSportCar, isElectroCar;

    public Car(int yearOfProduction, String color, boolean isSportCar, boolean isElectroCar) {
        setVin();
        setColor(color);
        setYearOfProduction(yearOfProduction);
        setElectroCar(isElectroCar);
        setSportCar(isSportCar);
    }

    public Car(int yearOfProduction, VehicleColor color, boolean isSportCar, boolean isElectroCar) {
        setVin();
        setColor(color);
        setYearOfProduction(yearOfProduction);
        setElectroCar(isElectroCar);
        setSportCar(isSportCar);
    }

    @Override
    public String getVehicleInfo() {
        return getVin() + " " + getYearOfProduction() + " " + getColor().toString() + " " + (isElectroCar? "electric car" : "not electric car") + " " + (isSportCar? "sport car" : "not sport car");
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public void setElectroCar(boolean electroCar) {
        isElectroCar = electroCar;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public boolean isElectroCar() {
        return isElectroCar;
    }
}
