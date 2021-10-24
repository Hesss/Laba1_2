package ru.codeinside.lessons.javacore.implementation;

public interface Service {

    String makeService();

    String getName();

    default String getShortName() {
        return "НЕТ ИНФОРМАЦИИ";
    }

}
