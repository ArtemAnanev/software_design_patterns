package structural.adapter.bank;

public class ABank {
    private int balance;
    public ABank() {balance = 200; }

    public void getBalance() {
        System.out.println("Abank balance = " + balance);
    }
}
