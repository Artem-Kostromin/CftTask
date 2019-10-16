import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    static void readFile(String inputFileName) {
        ArrayList<String> linesOfCoordinates = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            try {
                String lineOfFile;
                while ((lineOfFile = br.readLine()) != null) {
                    linesOfCoordinates.add(lineOfFile);
                }
                MapGenerator.recordInMap(linesOfCoordinates);
            } finally {
                br.close();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void writeFile(String result, String outFileName) {
        try (FileWriter outFile = new FileWriter(outFileName)) {
            outFile.write(result);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
