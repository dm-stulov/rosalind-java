package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class IEV {
    private static final String FILENAME = "rosalind_iev.txt";


    private static String[] readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String[] c;
        while ((c = reader.readLine().split(" ")) != null) {
            return c;
        }
        return c;
    }

    private static float caster(String[] arrStr) {
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);   //Integer.parseInt(arrStr[i]);
        }
        return offspring(arrInt[0], arrInt[1], arrInt[2], arrInt[3], arrInt[4], arrInt[5]);
    }


    private static float offspring(int a, int b, int c, int d, int f, int g) {
        int population = a + b + c + d + f + g;
        float freqdom = (float) (a + b + c + 0.75 * d + 0.5 * f);
        return freqdom * 2;
    }

    public static void main(String[] args) throws IOException {

        String[] arrStr = readerFile();
        System.out.println(caster(arrStr));


        //System.out.println(offspring (1, 0, 0, 1, 0, 1));
    }
}
