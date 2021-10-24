package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

public class Truck extends Vehicle {

    private boolean isCanvasBack;

    public Truck(int yearOfProduction, String color, boolean isCanvasBack) {
        setVin();
        setColor(color);
        setYearOfProduction(yearOfProduction);
        setCanvasBack(isCanvasBack);
    }

    public Truck(int yearOfProduction, VehicleColor color, boolean isCanvasBack) {
        setVin();
        setColor(color);
        setYearOfProduction(yearOfProduction);
        setCanvasBack(isCanvasBack);
    }

    @Override
    public String getVehicleInfo() {
        return getVin() + " " + getYearOfProduction() + " " + getColor().toString() + " " + (isCanvasBack? "have canvas back" : "haven't canvas back");
    }

    public void setCanvasBack(boolean canvasBack) {
        isCanvasBack = canvasBack;
    }

    public boolean isCanvasBack() {
        return isCanvasBack;
    }
}
