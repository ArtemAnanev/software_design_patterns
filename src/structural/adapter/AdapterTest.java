package structural.adapter;

import structural.adapter.bank.ABank;
import structural.adapter.bank.PBank;

public class AdapterTest {
    public static void main(String[] args) {
        PBank pBank = new PBank();
        pBank.getBalance();
        PBankAdapter abank = new PBankAdapter(new ABank());
        abank.getBalance();
    }
}
