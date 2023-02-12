package skillter._06_05;

import java.io.*;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    public String getFirstLine() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:\\.Java Workspace\\AdvancedJavaLesson\\src\\main\\java\\skillter\\_06_05\\BufferedReaderVsScanner.txt")))) {

            String firstLine = bufferedReader.readLine();
            return firstLine;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    public String getWholeFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:\\.Java Workspace\\AdvancedJavaLesson\\src\\main\\java\\skillter\\_06_05\\BufferedReaderVsScanner.txt")))) {

            StringBuffer wholeFile = new StringBuffer();
            bufferedReader.lines().forEach(line -> {
                wholeFile.append(line);
            });
            return wholeFile.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
