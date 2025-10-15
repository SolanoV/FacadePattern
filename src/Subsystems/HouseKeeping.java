package Subsystems;

public class HouseKeeping implements HotelService {
    private void cleanRoom(String roomNumber) {
        System.out.println("House Keeping Service: Cleaning room number "+roomNumber);
    }

    @Override
    public void executeService(String roomNumber) {
        cleanRoom(roomNumber);
    }


}
