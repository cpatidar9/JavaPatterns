import com.factory.CarFactory;
import com.products.Engine;
import com.products.Transmission;

public class Main {
    public static void main(String[] args) {

        CarFactory carFactory1 = CarFactory.getCarFactory("maruti");
        Engine marutiEngine = carFactory1.createEngine();
        Transmission marutiTransmission = carFactory1.createTransmission();

        marutiEngine.makeEngine();
        marutiTransmission.makeTransmission();

        CarFactory carFactory2 = CarFactory.getCarFactory("ford");
        Engine fordEngine = carFactory2.createEngine();
        Transmission fordTransmission = carFactory2.createTransmission();

        fordEngine.makeEngine();
        fordTransmission.makeTransmission();

    }
}