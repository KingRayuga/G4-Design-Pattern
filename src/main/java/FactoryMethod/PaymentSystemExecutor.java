package FactoryMethod;

public class PaymentSystemExecutor {

    private static final Integer amount = 69000;
    public static void main(String[] args){
        PaymentProcessorFactory creditCardFactory = new CreditCardProcessorFactory();
        PaymentSystem paymentSystem = new PaymentSystem(creditCardFactory);
        paymentSystem.processPayment(amount);

        PaymentProcessorFactory UPIFactory = new UPIProcessorFactory();
        paymentSystem = new PaymentSystem(UPIFactory);
        paymentSystem.processPayment(amount);
    }
}
