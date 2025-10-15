package Subsystems;

public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Service: Picking up vehicle, License Plate \""+plateNumber+"\"");
    }

    @Override
    public void executeService() {
        System.out.println("Valet: Service: Parking vehicle");
    }


}
