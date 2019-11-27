package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RNA {
    private static final String FILENAME = "rosalind_rna.txt";


    private static String readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String c;
        while ((c = reader.readLine()) != null) {
            return c;
        }
        return c;
    }

    private static String transcribe(String string) {
        return string.replace('T', 'U');
    }



    public static void main(String[] args) throws IOException {
        String str = readerFile();
        System.out.println(transcribe(str));

    }

}
