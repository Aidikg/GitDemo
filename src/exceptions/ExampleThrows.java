package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleThrows {
	// bufferedwriter vs fileWriter
	public static void writeFile(String text) throws IOException{
		File myFile=new File("textFile2.txt");
		FileWriter fileWriter=new FileWriter(myFile);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(text);
		bufferedWriter.close();
	}
	public static void main(String[] args) throws IOException {
		writeFile("Text file created by default");
	}
}
