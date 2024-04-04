package FactoryMethod;

public class UPIProcessorFactory extends PaymentProcessorFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new UPIProcessor();
    }
}
