package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class CreateFile {
	public static void main(String[] args) {
		File file=new File("src/FileHandling/Hello.txt");
		//FileWriter write=new FileWriter(file);
		
		try {
			
			System.out.println(file.createNewFile());
			FileWriter write=new FileWriter(file);
			write.write("Hi Abcd");
			write.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
