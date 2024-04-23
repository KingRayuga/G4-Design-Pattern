package AbstractFactoryMethod.Car;

import AbstractFactoryMethod.AbstractVehicleFactory;
import AbstractFactoryMethod.Vehicle;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("Micro")) {
            return new MicroCar();
        }
        else if(type.equalsIgnoreCase("Mini")) {
            return new MiniCar();
        }
        else{
            return new MiniCar();
        }
    }
}
