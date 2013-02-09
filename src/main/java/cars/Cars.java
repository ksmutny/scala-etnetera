package cars;

import java.util.List;

public class Cars {
    public static List<CarModel> models() {
        return scala.collection.JavaConversions.asJavaList(package$.MODULE$.models());
    }
}
