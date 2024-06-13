import com.facade.ProductFacade;

public class Main {
    public static void main(String[] args) {

        ProductFacade productFacade = new ProductFacade();

        boolean b = productFacade.isItemBelowROL(100);
        if (b) {
            System.out.println("Product Below ROL");
        } else {
            System.out.println("Product Not Below ROL");
        }
    }
}