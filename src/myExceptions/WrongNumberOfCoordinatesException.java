package myExceptions;

public class WrongNumberOfCoordinatesException extends Throwable {
    public WrongNumberOfCoordinatesException(String lineOfFile) {
        System.out.println("В строке " + lineOfFile + " неправильное количество координат или неверно указаны разделители!");
    }
}
