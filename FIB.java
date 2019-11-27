package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FIB {
    private static final String FILENAME = "rosalind_fib.txt";


    private static String[] readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String[] c;
        while ((c = reader.readLine().split(" ")) != null) {
            return c;
        }
        return c;
    }


    private static int fib(int n, int k) {

        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fib(n - 1, k) + fib(n - 2, k) * k;
        }
    }


    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String[] string = readerFile();

        int caster = Math.abs(fib(Integer.parseInt(string[0]), Integer.parseInt(string[1])));
        System.out.println(stringBuilder.append(Integer.toString(caster)));


    }

}
