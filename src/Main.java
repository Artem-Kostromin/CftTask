import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputFileName = args[0];
        String outFileName = args[1];

        FileUtils.readFile(inputFileName);
        Map<Float, String> areasAndCoordinatesMap = MapGenerator.getAreaOfTriangles();
        String result = AreaComparator.findCoordinatesWithBiggestArea(areasAndCoordinatesMap);
        FileUtils.writeFile(result, outFileName);
    }
}
