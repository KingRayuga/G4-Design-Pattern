package FactoryMethod;

public class CreditCardProcessorFactory extends PaymentProcessorFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardProcessor();
    }
}
