import java.util.Collections;
import java.util.Map;
import java.util.Set;

class AreaComparator {
    static String findCoordinatesWithBiggestArea(Map<Float, String> map) {
        Set<Float> keys = map.keySet();
        Float biggestArea = Collections.max(keys);
        return map.get(biggestArea);
    }
}
