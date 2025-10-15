package Subsystems;

public class Cart implements HotelService {
    public void requestCart(String numberOfCarts){
        System.out.println("Cart Service: Delivering "+Integer.parseInt(numberOfCarts)+" carts.");
    }

    @Override
    public void executeService() {
        System.out.println("Cart Service: Requesting Luggage Cart.");
    }
}
