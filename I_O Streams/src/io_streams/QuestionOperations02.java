package io_streams;


import java.io.*;
import java.util.Scanner;

public class QuestionOperations02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
String inputFileName = sc.nextLine();

System.out.print("Enter the output file name: ");
String outputFileName = sc.nextLine();

try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
     BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

    String line;
    while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.newLine();
    }

    System.out.println("File is copied.");

} catch (FileNotFoundException e) {
    System.out.println("Input file not found: " + inputFileName);
} catch (IOException e) {
    System.out.println("Error copying the file.");
	        }

	        sc.close();
	    }
	}

