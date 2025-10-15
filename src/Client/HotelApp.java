package Client;

import Facade.Frontdesk;
import Subsystems.Cart;
import Subsystems.HouseKeeping;
import Subsystems.Valet;

public class HotelApp {
    public static void main(String[] args) {
        Cart cart=new Cart();
        HouseKeeping houseKeeping=new HouseKeeping();
        Valet valet=new Valet();
        Frontdesk frontDesk = new Frontdesk(cart,houseKeeping,valet);

        frontDesk.requestValet("XYZ123");
        frontDesk.requestHouseKeeping("101");
        frontDesk.requestCart(2);
    }
}
