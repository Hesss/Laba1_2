package ru.codeinside.lessons.javacore.implementation;

public class ServiceDemo {
    public static void main(String[] args) {
        Service service = new Freelancer("Anton", "Qiwi");
        System.out.println(service.getName());
        System.out.println(service.getShortName());
        System.out.println(service.makeService());

        service = new Company("265765264175", "Call-center", "40817-810-5-7000-0123456");
        System.out.println(service.getName());
        System.out.println(service.getShortName());
        System.out.println(service.makeService());
    }
}
