package Unit_4;

abstract class Payment {

    private int transactionID;
    public int amount;

    public int getTransactionID(){
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CreditCardPayment extends Payment {

    public int convenienceFee;

    @Override
    void processPayment() {
        convenienceFee = (amount * 2)/100;
        amount = amount + convenienceFee;
        System.out.println("Convenience Fee:" + convenienceFee);
        System.out.println("Total Amount:" + amount);
    }
}

class UPIPayment extends Payment{

    @Override
    void processPayment() {
        System.out.println("Total Amount:" + amount);
    }
}

public class CaseStudyMain{

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        p1.setAmount(1000);
        p1.processPayment();

        Payment p2 = new UPIPayment();
        p2.setAmount(1000);
        p2.processPayment();
    }
}
