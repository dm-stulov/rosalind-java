package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class SUBS {
    private static final String FILENAME = "resrosalind_subs.txt";

    private static String[] readerFile() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            List<String> lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                lines.add("\n");
            }
            String [] linesAsArray = lines.toArray(new String[lines.size()]);
            reader.close();
            return linesAsArray;
        } catch (IOException e) {
            return null;
        }
    }


    /*have a problem in split of the str*/
    public static void main(String[] args) throws IOException {
          String[] strArr = readerFile();


    }

}
