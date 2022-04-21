package de.hfu;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App  {
public static void main (String[] argv) {
	
	
	System.out.println("Please enter a string: ");
    Scanner sc = new Scanner(System.in);
    String toTranslate = sc.nextLine();
 
    System.out.println(toTranslate.toUpperCase());

}
}
