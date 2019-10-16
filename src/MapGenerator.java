import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapGenerator {
    private static Map<Float, String> areaOfTriangles = new HashMap<>();
    public static void recordInMap(ArrayList<String> inputLines) {
        for(String s:inputLines){
            if (Validation.isValid(s)) {
                areaOfTriangles.put(AreaCalculator.calculate(s), s);
            }
        }
    }


    public static Map<Float, String> getAreaOfTriangles() {
        return areaOfTriangles;
    }
}
