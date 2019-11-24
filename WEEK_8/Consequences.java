import java.util.Random;

public class Consequences{
// instance varibales

String he[];
String she[];
String at[];
String heSaid[];
String sheSaid[];
String cons[];

	public static void Conseqeunces(){
	// constructor
	String [] he = {"Idrees","Waris","Dion","Israel"};
	String [] she = {"Nicole", "Zoe", "Eva", "Hadia"};
	String [] at = {"Library","Garden","Colombia","Toilet"};
	String [] heSaid = {"if you loved it","if you love sucking lollipops","press the button","tick the box"};
	String [] sheSaid = {"if you killed it","if you love licking lollipops","cut your nails","tick the box"};
	String [] cons ={"impeachment","banishment","execution","murder"};
	}
	
	public void play(){
		//ASSIGN RANDOM NUMBER TO EACH ARRAY ELEMENT.
			// each number[] generated should be different 
		System.out.println(he[(int) Math.random()]+ "met"+ she[(int) Math.random()] + "at" + at[(int) Math.random()] + "he said" + heSaid[(int) Math.random()] + "she said" + sheSaid[(int) Math.random()] + "the consequence was" + cons[(int) Math.random()] );
	}
}
