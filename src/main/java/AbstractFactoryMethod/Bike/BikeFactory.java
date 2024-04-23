package AbstractFactoryMethod.Bike;

import AbstractFactoryMethod.AbstractVehicleFactory;
import AbstractFactoryMethod.Vehicle;

public class BikeFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Normal")) {
            return new NormalBike();
        }
        else if(type.equalsIgnoreCase("Sports")) {
            return new SportsBike();
        }
        else{
            return new NormalBike();
        }
    }
}
