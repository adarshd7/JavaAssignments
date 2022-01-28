package Assignment.Assignment1;


import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

    public class JavaAssignment1{

        public static final File fileobj = new File("C:\\Users\\Adarsh");


        public static void main(String args[]) {

            System.out.println("Enter the Regular expression to search files");
            Scanner sc = new Scanner(System.in);
            String regex = sc.nextLine();
            FilenameFilter filter = new FilenameFilter(){
                public boolean accept(File fileobj, String name) {
                    return name.matches(regex);
                }};
            printMatchedFiles(filter);

        }

        static void printMatchedFiles(FilenameFilter filter) {

            File files[] = fileobj.listFiles(filter);
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

