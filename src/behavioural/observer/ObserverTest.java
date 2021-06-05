package behavioural.observer;

public class ObserverTest {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("Vasya");
        university.addObserver(director);
        university.addStudent("Inna");
        university.removeStudent("Vasya");
    }
}
