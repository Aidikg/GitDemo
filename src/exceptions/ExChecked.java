package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExChecked {
	public static void writeToFile(String text) {
		File myfile=new File("hgfhsj");
		//FileWriter filew=new FileWriter(myfile);
		
		try {
			FileWriter filew=new FileWriter(myfile);
		}
		catch(IOException e) {
			System.out.println("No such path");
		}
	}
}
