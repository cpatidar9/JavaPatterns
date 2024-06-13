import com.strategy.CreditPaymentStrategy;
import com.strategy.Product;
import com.strategy.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product(111, "p1", 10));
        shoppingCart.addProduct(new Product(222, "p2", 20));

        shoppingCart.pay(new CreditPaymentStrategy("user1", "123"));
    }
}