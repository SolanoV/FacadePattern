package Subsystems;

public class Valet implements HotelService {
    private void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Service: Picking up vehicle... License Plate \""+plateNumber+"\"");
    }

    @Override
    public void executeService(String plateNumber) {
        pickUpVehicle(plateNumber);
    }


}
