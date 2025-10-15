package Facade;

import Subsystems.Cart;
import Subsystems.HouseKeeping;
import Subsystems.Valet;

public class Frontdesk {
    private Cart cart;
    private HouseKeeping houseKeeping;
    private Valet valet;


    public Frontdesk(Cart cart, HouseKeeping houseKeeping, Valet valet) {
        this.cart = cart;
        this.houseKeeping = houseKeeping;
        this.valet = valet;
    }
    public void requestValet(String plateNuber){
        valet.executeService();
        valet.pickUpVehicle(plateNuber);
    }

    public void requestHouseKeeping(String roomNumber){
        houseKeeping.executeService();
        houseKeeping.cleanRoom(roomNumber);
    }
    public void requestCart(int numberOfCarts){
        cart.executeService();
        cart.requestCart(String.valueOf(numberOfCarts));
    }
}
