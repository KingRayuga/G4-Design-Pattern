package AbstractFactoryMethod.Bike;

public class NormalBike extends Bike{
    @Override
    public void setVehicleType(){
        bikeType = "Normal";
    }

    @Override
    public void setBaseCost(){
        baseCost = 20;
    }

    @Override
    public void setVehicleChargesPerUnitDistance(){
        chargesPerUnitDistance = 5;
    }
}
