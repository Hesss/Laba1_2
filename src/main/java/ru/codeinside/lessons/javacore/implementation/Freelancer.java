package ru.codeinside.lessons.javacore.implementation;

public class Freelancer implements Service {

    private String nickname;
    private String electronicWallet;

    @Override
    public String makeService() {
        return this.getClass().toGenericString() + " " + nickname + " provided the service. His Electronic wallet: " + electronicWallet;
    }

    @Override
    public String getName() {
        return nickname;
    }

    @Override
    public String getShortName() {
        return this.getClass().toGenericString();
    }

    public Freelancer(String nickname, String electronicWallet) {
        this.nickname = nickname;
        this.electronicWallet = electronicWallet;
    }
}
