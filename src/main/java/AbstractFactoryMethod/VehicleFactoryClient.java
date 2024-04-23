package AbstractFactoryMethod;

import java.util.Scanner;

public class VehicleFactoryClient {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Select mode of Vehicle");
        String vehicle = scn.nextLine();
        System.out.println("Select mode of Vehicle");
        String type = scn.nextLine();
        System.out.println("Distance you want to travel");
        int distance = scn.nextInt();

        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory(vehicle);
        Vehicle miniCar = carFactory.getVehicle(type);
        miniCar.book(distance);

    }

}
