public class DogTest{

public static void main(String [] args){
 Dog[] dogs = new Dog[2];// CREATE AN EMPTY ARRAY OF DOG OBJECTS
 dogs[0] = new Dog("billy");// ASSIGNING VALUE BILLY TO DOG ARRAY[0]
 dogs[1] =  new Dog("Nicole"); // ASSIGNING VALUE NICOLE TO DOG ARRAY[1]
 for(Dog d: dogs){ // LOOP THROUGH DOG ARRAY AND THEN USE APPLY BARK METHOD TO EACH 
 	d.bark();
 }
}

}
	
