import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File outputDirectory = new File("output");
        if (!outputDirectory.exists()) {
            outputDirectory.mkdir();
        }

        File helloFile = new File(outputDirectory,"hello.txt");
        try (FileWriter writer = new FileWriter(helloFile)) {
            writer.write("Đây là Huy");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File subfolder = new File("subfolder");
        if(!subfolder.exists()){
            subfolder.mkdir();
        }

        File output1File = new File(subfolder, "output1.txt");
        try (FileWriter writer = new FileWriter(output1File)) {
            writer.write("Đây là output 1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File output1Folder = new File(subfolder, "output1");
        if (!output1Folder.exists()) {
            output1Folder.mkdir();
        }
        File subfolder1 = new File(outputDirectory, "subfolder1");
        subfolder.renameTo(subfolder1);
    }
}
