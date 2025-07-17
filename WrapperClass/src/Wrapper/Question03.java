package Wrapper;


import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");
int number = sc.nextInt();

if (number < 1 || number > 255) {
    System.out.println("Invalid input. Number must be between 1 and 255.");
} else {
    String binaryString = Integer.toBinaryString(number);
    String formattedBinary = String.format("%8s", binaryString).replace(' ', '0');
System.out.println("8-bit Binary Representation: " + formattedBinary);
sc.close();
	        }
	    }
	}

