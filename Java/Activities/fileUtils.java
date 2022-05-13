import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class fileUtils {

public static void main(String[] args) {
    File file1 = new File("Desktop\\Hello.txt");
    File file2 = new File("Desktop\\HelloCopy.txt");
    System.out.println(file1.getAbsolutePath());

}
}
