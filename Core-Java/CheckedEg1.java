import java.io.File;
import java.io.FileNotFoundException;
import java .util.Scanner;
public class CheckedEg1 {
    public static void main(String[] args) {
        try{
            File file = new File("myfile.text");
            Scanner sc = new Scanner(file);

            System.out.println("File opened successfully");

        }catch (FileNotFoundException e){
            System.out.println("File not found :"+e.getMessage());
        }
    }
}
