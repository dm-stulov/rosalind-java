package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class REVC {
    private static final String FILENAME = "rosalind_revc.txt";


    private static String readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String c;
        while ((c = reader.readLine()) != null) {
            return c;
        }
        return c;
    }

    private static void replacer(String str) {
        StringBuilder out = new StringBuilder();

        str =  str.replace('A', 't').
                replace('T', 'a').replace('C', 'g').
                replace('G', 'c').toUpperCase();

        out.append(str);
        out = out.reverse();
        System.out.println(out);
    }

    public static void main(String[] args) throws IOException {
        String str = readerFile();
        replacer(str);
    }

}
