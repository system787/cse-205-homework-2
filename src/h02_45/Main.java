package h02_45;//******************************************************************************
// CLASS: h02_45.h02_51.Main (h02_45.h02_51.Main.java)
//
// DESCRIPTION
// This is the main class for the program.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************
import java.util.ArrayList; 

/**
 * The main class for the program.
 */
public class Main { 

    /**
     * main() instantiates an object of this h02_45.h02_51.Main class and then calls run()
     * on the object.
     */
	public static void main(String[] pArgs) {
	    new Main().run();
	} 

    /**
     * run() is essentiall the OO version of the class/static method main().
     * We create an ArrayList of h02_45.MakesSound, i.e., an ArrayList of objects
     * which implement the h02_45.MakesSound interface, e.g., h02_45.Dog objects, h02_45.Cat objects,
     * and h02_45.Cricket objects. After creating the list, we add various animals to
     * it. Then we call beNoisy() passing the ArrayList as the argument.
     */
	private void run() { 
		ArrayList<MakesSound> critters = new ArrayList<>(); 
		critters.add(new Dog()); 
		critters.add(new Cat()); 
		critters.add(new Cricket()); 
		critters.add(new Cat()); 
		critters.add(new Cricket());

		// h02_45.Bee and h02_45.Frog
		critters.add(new Bee());
		critters.add(new Frog());
		critters.add(new Bee());
		critters.add(new Frog());
		critters.add(new Bee());
		critters.add(new Frog());

		beNoisy(critters); 
	} 

    /**
     * beNoisy() receives the ArrayList of objects that implement the h02_45.MakesSound
     * interface. beNoisy() uses an enhanced for loop to iterate over the
     * ArrayList and calls the makeSound() method on each object.
     *
     * Because various classes (h02_45.Dog, h02_45.Cat, h02_45.Cricket) all implement the makeSound()
     * method, in the statement critter.makeSound() we are polymorphicall call-
     * ing the correct makeSound() method based on the type of critter. For
     * example, when critter is a h02_45.Dog, we will call h02_45.Dog.makeSound() which will
     * print "Bark". When critter is a h02_45.Cat, we will call h02_45.Cat.makeSound() which
     * will print "Meow". And when critter is a h02_45.Cricket, we will call h02_45.Cricket.
     * makeSound() which will print "Chirp". 
     */
	private void beNoisy(ArrayList<MakesSound> pCritters) { 
		for (MakesSound critter : pCritters) { 
			critter.makeSound();
		} 
	} 
} 
