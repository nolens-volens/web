package by.atrushkevich.web.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class DataReader {
    static Logger logger = LogManager.getLogger();

    public String readData(String filePath) {
        File file = new File(getClass().getClassLoader().getResource(filePath).getFile());

        String text = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            text = bufferedReader.lines().collect(Collectors.joining(" "));
        } catch (IOException e) {
            logger.log(Level.ERROR, "Can't reading the file.", e);
        }

        return text;
    }
}
