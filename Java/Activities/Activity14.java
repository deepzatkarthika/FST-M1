import org.apache.commons.io.FileUtils;
import sun.nio.ch.Util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Activity14 {

public static void main(String[] args) throws IOException {
    File file=new File("C:\\Intellij\\hello1\\files\\Input.txt");
    file.createNewFile();
    FileWriter fs= new FileWriter(file);
    if (file.canWrite())
    {
        fs.write("hello User");
    }
    fs.close();

    int i=0;
    FileReader fr=new FileReader(file);
    while((i=fr.read())!=-1)
    {
       System.out.println((char)i );

    }
    fr.close();
    File srcDir = new File("C:\\Intellij\\hello1\\files\\Input.txt");

    File dstDir=new File("C:\\Intellij\\hello1\\files\\copy\\copy.txt");
    File dstDirtemp=FileUtils.getTempDirectory();
    System.out.println("temporary path"+dstDirtemp.getPath());
    Files.copy(srcDir.toPath(),dstDir.toPath());
    File destfile=new File(dstDirtemp.getPath()+"\\copy.txt");
    FileUtils.copyFile(srcDir,destfile);


}
}


