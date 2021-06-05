package structural.facade;

class Key implements Car{
    @Override
    public void start() {
        System.out.println("Вставить ключ");
    }

    @Override
    public void stop() {
        System.out.println("Вытащить ключ");
    }
}
