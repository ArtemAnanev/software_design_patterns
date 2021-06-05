package structural.adapter;

import structural.adapter.bank.ABank;
import structural.adapter.bank.PBank;

public class PBankAdapter extends PBank {
    private ABank aBank;
    public PBankAdapter(ABank aBank) {
        this.aBank = aBank;
    }

    @Override
    public void getBalance() {
        aBank.getBalance();
    }
}
