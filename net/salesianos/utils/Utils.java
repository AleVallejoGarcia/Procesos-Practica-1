package salesianos.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    public static ArrayList<String> getAllLines(String fileRoute) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoute));

            String currentLine = bufferedReader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    public static Integer getTotalVocalsFrom(String fileRoute) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileRoute));
            String firstLine = bufferedReader.readLine();
            bufferedReader.close();
            return Integer.parseInt(firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }
}