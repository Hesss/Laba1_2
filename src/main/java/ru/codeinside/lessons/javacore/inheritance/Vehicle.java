package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

import java.util.Random;

public abstract class Vehicle {

    public String vin;
    public int yearOfProduction;
    public VehicleColor color;

    /**
     * @return Информация о машине
     */
    public abstract String getVehicleInfo();

    /**
     * Метод генерирует псевдо-случайный идентификационный номер транспортного средства.
     * Данный номер используется в целях обучения и не соответствует ISO 3779-1983 и ISO 3780.
     * Переделывать или вносить изменения в этот метод не требуется.
     *
     * @return псевдо-уникальный VIN
     */
    private static String generateVin() {
        var source = "ABCDEFGHJKLMNPQRSTUVWXYZ1234567890";
        var sb = new StringBuilder();
        int i = 0;
        var random = new Random();
        while (i < 17) {
            sb.append(source.charAt(random.nextInt(source.length())));
            i++;
        }
        return sb.toString();
    }

    public String getVin() {
        return vin;
    }

    public void setVin() {
        this.vin = generateVin();
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = VehicleColor.getColorByName(color);
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }
}
