package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PERM {
    private static final String FILENAME = "rosalind_perm.txt";


    private static String readerFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String c;
        while ((c = reader.readLine()) != null) {
            return c;
        }
        return c;
    }

    private static StringBuilder createStr(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i);
        }
        return stringBuilder;
    }


    private static Set<String> generatePerm(String input) {
        Set<String> set = new HashSet<>();
        if (input == "") return set;

        char a = input.charAt(0);

        if (input.length() > 1) {
            input = input.substring(1);
            Set<String> permSet;
            permSet = generatePerm(input);

            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        } else {
            set.add(a + "");
        }
        return set;
    }


    public static void main(String[] args) throws IOException {
        String str = readerFile();
        int intReaderFile = Integer.parseInt(str);

        Set<String> stringSet = generatePerm(createStr(intReaderFile).toString());
        Object[] arrStr = stringSet.toArray();

        String outStr;
        System.out.println(arrStr.length);
        for (Object o : arrStr) {
            outStr = (String) o;
            System.out.println(outStr.replace("", " ").trim());
        }

    }
}
