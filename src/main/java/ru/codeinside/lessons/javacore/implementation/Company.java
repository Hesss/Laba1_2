package ru.codeinside.lessons.javacore.implementation;

public class Company implements Service {

    private String inn;
    private String name;
    private String bankNumberAccount;

    @Override
    public String makeService() {
        return this.getClass().toGenericString() + " " + name + " provided the service. His bank number account: " + bankNumberAccount;
    }

    @Override
    public String getName() {
        return name + " " + inn;
    }

    public Company(String inn, String name, String bankNumberAccount) {
        this.inn = inn;
        this.name = name;
        this.bankNumberAccount = bankNumberAccount;
    }
}
