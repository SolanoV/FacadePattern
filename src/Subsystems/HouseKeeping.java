package Subsystems;

public class HouseKeeping implements HotelService {
    public void cleanRoom(String roomNumber) {
        System.out.println("House Keeping Service: Cleaning room number "+roomNumber);
    }

    @Override
    public void executeService() {
        System.out.println("House Keeping Service: Cleaning in progress");
    }


}
