import  java.io.FileWriter;
import java.io.IOException;

public class CheckedEg2 {
    public static void main(String[] args) {
     try{
        FileWriter fw = new FileWriter("Output.txt");
        fw.write("Ankit jha");
        fw.close();
        System.out.println("File Written Successfully.");
    }catch( IOException e){
        System.out.println("IO exception :"+e.getMessage());
    }
}
}