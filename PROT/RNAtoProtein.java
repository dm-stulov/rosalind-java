package tasks.PROT;

import java.io.IOException;
import java.util.Properties;


class RNAtoProtein {

  static Properties table;

    static {
        try {
            table = IOHandler.readProps("RNACodonTable");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String translate(String RNASample) {
    String[] data = RNASample.split("(?<=\\G...)");
    StringBuilder protein = new StringBuilder();
    String value = "";
    for (String codon : data) {
      value = (String)table.get(codon);
      if (value.equals("Stop")) {
        return protein.toString();
      }
      protein.append(value);
    }
    return protein.toString();
  }

  public static void main(String[] args)  {
    try {
        IOHandler ioHandler = new IOHandler();
      String rna = IOHandler.inputData("in.txt");
      String protein = translate(rna);
      IOHandler.outputData("output.txt", protein);
    } catch (IOException e) {
      System.err.println("IO error!");
    }
  }
}
