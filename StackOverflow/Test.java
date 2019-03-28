import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {

    private static Scanner x;

    public static void main(String[] args) {
        String filepath = "TradeDetails.txt";
        String removeTerm = "3";

        removeRecord(filepath, removeTerm);
    }

    public static void removeRecord(String filepath, String removeTerm) {
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filepath));
            while (x.hasNextLine()) {
                String line = x.next();
                
                // split the line based on comma as it is CSV
                String line_values[] = line.split(",");
                if (!line_values[0].equals(removeTerm)) {
                    System.out.println("Keeping Line :: "+line);
                    pw.write(line);
                    pw.write("\n");// new line
                }else{
                    System.out.println("Removing Line :: "+line);
                }

            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        } catch (Exception e) {

        }
    }
}








    








    








    

    

     


