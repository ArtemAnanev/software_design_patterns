package creational.factory;

import creational.factory.os.OS;

public class FactoryTest {
    public static void main(String[] args) {
        String win = "windows";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}
