/*
AUTHOR: Audra Martin (GitHub: @amartin009)
DATE: 01.07.2020
DESCRIPTION: Reader.java class is a class that reads in a file and determines the size of the file in bytes, kilobytes,
megabytes, gigabytes, and terabytes.
*/

import java.io.File;
import javax.swing.JFileChooser;

public class Reader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Please select the input file to be read.");
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            double bytes = selectedFile.length();
            System.out.println("Bytes: " + bytes);
            double kilobytes = (bytes / 1024);
            System.out.println("Kilobytes: " + kilobytes);
            double megabytes = (kilobytes / 1024);
            System.out.println("Megabytes: " + megabytes);
            double gigabytes = (megabytes / 1024);
            System.out.println("Gigabytes: " + gigabytes);
            double terabytes = (gigabytes / 1024);
            System.out.println("Terabytes: " + terabytes);
        } else {
            System.out.println("File not selected or found.");
        }
    }
}
