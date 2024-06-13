import com.decorator.Animal;
import com.decorator.LegDecorator;
import com.decorator.LivingAnimal;
import com.decorator.WingDecorator;

public class Main {
    public static void main(String[] args) {

        Animal animal = new LivingAnimal();
        //        animal.describe();

        // This will have basic of animal and leg functionality
        LegDecorator legDecorator = new LegDecorator(animal);
        //        legDecorator.describe();

        // This will have basic of animal and leg and wing functionality
        WingDecorator wingDecorator = new WingDecorator(legDecorator);
        wingDecorator.describe();

        // This will only have basic of animal and wing functionality
        //        WingDecorator wingDecorator = new WingDecorator(animal);
        //        wingDecorator.describe();

    }
}