public class AreaCalculator {
    public static Float calculate(String lineOfFile) {
        String[] pointsCoordinates = lineOfFile.split(" ");
        Float x1 = Float.parseFloat(pointsCoordinates[0]);
        Float y1 = Float.parseFloat(pointsCoordinates[1]);
        Float x2 = Float.parseFloat(pointsCoordinates[2]);
        Float y2 = Float.parseFloat(pointsCoordinates[3]);
        Float x3 = Float.parseFloat(pointsCoordinates[4]);
        Float y3 = Float.parseFloat(pointsCoordinates[5]);
        return Math.abs(0.5f*((x1-x3)*(y2-y3) - (y1-y2)*(x2-x3)));
    }
}
