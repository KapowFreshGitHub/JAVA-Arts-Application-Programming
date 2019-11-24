public class Dog{ // CREATE CLASS FOR DOG
 private String name;// PROPERTIES OF INSTANCE OF THE OBJECT 
 
 public Dog(String nameEG){ // CREATE DOG CONSTRUCTOR
  name = nameEG;
  }
  
  public void bark(){ // CREATE BARK METHOD
  System.out.println(name + " sAYS wOOF");}
  
  public String getName(){ // GET METHOD FOR NAME 
  	return name;}
 }
