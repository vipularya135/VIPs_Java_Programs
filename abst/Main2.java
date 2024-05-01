package abst;

abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank {
    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    public int getBalance() {
        return 200;
    }
}

public class Main2 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A balance: $" + bankA.getBalance());
        System.out.println("Bank B balance: $" + bankB.getBalance());
        System.out.println("Bank C balance: $" + bankC.getBalance());
    }
}
