package Subsystems;

public class Cart implements HotelService {
    private void requestCart(String numberOfCarts){
        System.out.println("Cart Service: Delivering "+Integer.parseInt(numberOfCarts)+" carts.");
    }

    @Override
    public void executeService(String numberOfCarts) {
        requestCart(numberOfCarts);
    }
}
