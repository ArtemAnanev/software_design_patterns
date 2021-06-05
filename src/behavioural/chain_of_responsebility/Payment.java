package behavioural.chain_of_responsebility;

public interface Payment {
    void setNext(Payment payment);
    void pay();
}
