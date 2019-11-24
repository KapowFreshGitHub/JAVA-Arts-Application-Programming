/*•	Make a simple programme, e.g. using Scanner, that:
1.	reads in a user’s name from the command line, 
2.	returns their name in uppercase 
3.	provides a count of the number of characters in their name.
	note the result if you provide e.g. first name and last name
4.	more ambitious (to try outside the lab) – ask the user to enter both first name and last name at the same time then return the last name in uppercase followed a comma, followed by the first name in lowercase (hint: look at the String split() method)
5.	even more ambitious String handling: repeat the first example but return the user’s name backwards (hint: String’s substring method)
*/
import java.util.Scanner;
public class Nameinput{
	public static void main(String[] args){
		Scanner name = new Scanner(System.in);
		String capsname = (name.toUpperCase());// CAN I USE CHAINING HERE? OR IS IT THAT ONLY FOR INPUTSTREAMREADER
		int count = 0;
		
		for( int i =0; i < name.length(); i++){
			count++;
		}
		System.out.println("Your name in uppercase:" + capsname + "You have" + count + "in your name");
	}
	
}