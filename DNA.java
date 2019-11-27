package tasks;

import java.io.*;


public class DNA {
    private static final String FILENAME = "rosalind_dna-3.txt";


    private static String readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String c;
        while ((c = reader.readLine()) != null) {
            return c;
        }
        return c;
    }


    public static void main(String[] args) throws IOException {
        String str = readerFile();
        int a = 0, c = 0, g = 0, t = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'A') {
                a += 1;
            } else if (ch == 'C') {
                c += 1;
            } else if (ch == 'G') {
                g += 1;
            } else if (ch == 'T') {
                t += 1;
            }
        }
        System.out.printf(a + " " + c + " " + g + " " + t);
    }

}
