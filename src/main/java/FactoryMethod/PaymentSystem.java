package FactoryMethod;

public class PaymentSystem {
    private PaymentProcessorFactory paymentProcessorFactory;

    public PaymentSystem(PaymentProcessorFactory paymentProcessorFactory){
        this.paymentProcessorFactory = paymentProcessorFactory;
    }

    public void processPayment(double amount){
        PaymentProcessor paymentProcessor = paymentProcessorFactory.createPaymentProcessor();
        paymentProcessor.processPayment(amount);
    }
}
