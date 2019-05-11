import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) throws IOException, NumberFormatException {
//        FileOutputStream stream = new FileOutputStream("D:\\file");
//        String s = "zalando SE";
//        byte[] bytes = s.getBytes();
//        stream.write(bytes);
//
//        stream.close();
//
//        FileWriter fileWriter = new FileWriter("D:\\file");
//        fileWriter.write("Zalando");
//        fileWriter.close();

        FileReader fileReader = new FileReader("D:\\file");
        String string = "";
        int i = 0;
        while ((i = fileReader.read()) != -1)
            string = string + (char) i;
        System.out.println(string);
        fileReader.close();

    }
}
