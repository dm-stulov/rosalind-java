package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IPRB {
    private static final String FILENAME = "rosalind_iprb-2.txt";


    private static String[] readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String[] c;
        while ((c = reader.readLine().split(" ")) != null) {
            return c;
        }
        return c;
    }

    private static void printer(float k, float m, float n) {
        float total = k + m + n;
        float prob;

        prob = k / total;
        prob += (m / total) * (k / (total - 1));
        prob += (n / total) * (k / (total - 1));
        prob += .75 * (m / total) * ((m - 1) / (total - 1));
        prob += .5 * (n / total) * (m / (total - 1));
        prob += .5 * (m / total) * (n / (total - 1));

        System.out.println(prob);
    }

    public static void main(String[] args) throws IOException {
        String[] arrStr = readerFile();

        if (arrStr.length == 3) {
            printer(Integer.parseInt(arrStr[0]), Integer.parseInt(arrStr[1]), Integer.parseInt(arrStr[2]));
        } else {
            System.out.println("EROR size of file");
        }
    }
}
