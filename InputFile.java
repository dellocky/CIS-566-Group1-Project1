/*
Created by Kyle Dellock 2/14/2026

Class to handle file reading
*/

import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;             

public class InputFile {
	File configFile;
	//CONSTRUTOR - InputFile
	//INPUT: Path to input file to be read, Abstract factory for input tolkens to command
	public InputFile(String path){
		this.configFile = new File(path);
	}
	
	//Commands the abstract factory based off comands from the input File
	public void process() {
		try (Scanner myReader = new Scanner(this.configFile)) {
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