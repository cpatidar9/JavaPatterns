import com.adapter.CelciusReporter;
import com.adapter.TempAdapter;
import com.adapter.TempClassAdapter;
import com.adapter.TempObjectAdapter;

public class Main {
    public static void main(String[] args) {

        CelciusReporter reporter = new CelciusReporter();
        reporter.setTemperatureInCel(40);

        System.out.println(reporter.getTemperatureInCel());

        // Class Adapter
        TempAdapter adapter1 = new TempClassAdapter();
        adapter1.setTempInC(34.5);
        System.out.println(adapter1.getTempInC());
        System.out.println(adapter1.getTempInF());

        adapter1.setTempInF(94.1);
        System.out.println(adapter1.getTempInF());
        System.out.println(adapter1.getTempInC());

        // Object Adapter
        TempAdapter adapter2 = new TempObjectAdapter();
        adapter2.setTempInC(34.5);
        System.out.println(adapter2.getTempInC());
        System.out.println(adapter2.getTempInF());

        adapter2.setTempInF(94.1);
        System.out.println(adapter2.getTempInF());
        System.out.println(adapter2.getTempInC());
    }
}