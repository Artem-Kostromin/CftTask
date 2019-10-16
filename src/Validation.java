import myExceptions.WrongNumberOfCoordinatesException;

public class Validation {
    static boolean isValid(String lineOfFile) {
        String[] coordinates = lineOfFile.split(" ");
        try {
            if(coordinates.length!=6) throw new WrongNumberOfCoordinatesException(lineOfFile);
            for(String s:coordinates){
                float floatNumber = Float.parseFloat(s);
            }
        }
        catch (WrongNumberOfCoordinatesException e) {
            return false;
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Среди координат в строке " + lineOfFile + " есть недопустмые значения");
            return false;
        }

        return true;
    }
}
