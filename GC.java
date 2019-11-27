package tasks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GC {
    private static final String FILENAME = "rosalind_gc.txt";


    private static void reader() throws IOException {
        Scanner in = new Scanner(new File(FILENAME));
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> sequences = new ArrayList<>();

        String seq = "";
        while (in.hasNextLine()) {
            String temp = in.nextLine();

            if (temp.charAt(0) == '>') {
                names.add(temp);
                sequences.add(seq);
                seq = "";
            } else {
                seq += temp;
            }
        }

        sequences.add(seq);
        sequences.remove(0);

        in.close();
        for (int i = 0; i < names.size(); i++) {
            System.out.println("names: " + names.get(i) + ", sequences: " + sequences.get(i));
        }

        int size = names.size();
        String maxName = "";
        double maxContent = 0;
        for (int i = 0; i < size; i++) {
            String temp = sequences.get(i);
            double GCContent = calContent(temp);

            if (GCContent > maxContent) {
                maxContent = GCContent;
                maxName = names.get(i);
            }
        }

        System.out.println(maxName.substring(1));
        System.out.println(maxContent * 100);
    }

    private static float calContent(String dna) {
        int Len = dna.length();
        float GCCount = 0;
        for (int i = 0; Len > i; i++) {
            if (dna.charAt(i) == 'G' || dna.charAt(i) == 'C') GCCount++;
        }

        System.out.println("count " + GCCount + " total " + Len);
        return (float) (GCCount / Len);
    }


    public static void main(String[] args) throws IOException {
        reader();
    }
}
