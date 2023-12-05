package org.semen.spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}// для ограничения создания обьектов через new

    public static ClassicalMusic getClassicalMusic() {// создаем фабричный метод который содает обьект
        return new ClassicalMusic();
    }

    public void doMyInit() {// вызываеться перед созданием бина название любое
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {// вызываеться перед закрытием приложения название любое
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
