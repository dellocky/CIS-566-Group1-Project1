import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;      
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {

		//TODO connect Map to factoires
		//Map<String, factory> dict = new HashMap<>();

		String path = "input.txt";
		File configFile = new File(path);
		try (Scanner myReader = new Scanner(configFile)) {
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				line = line.strip();
				//TODO connect methods from abstract factory to tokens
				System.out.println(line);
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("An error occurred, please ensure correct input file path");
				//e.printStackTrace();
			
		}
	}
}





