package creational.factory;

import creational.factory.os.OS;
import creational.factory.os.linuxOS;
import creational.factory.os.macOS;
import creational.factory.os.windowsOS;

public class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        if (inputos.equals("windows")) {
            os = new windowsOS();
        } else if (inputos.equals("linux")) {
            os = new linuxOS();
        } else if (inputos.equals("mac")) {
            os = new macOS();
        }
        return os;
    }
}
