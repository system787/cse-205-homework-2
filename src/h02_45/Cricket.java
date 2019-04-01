package h02_45;//******************************************************************************
// CLASS: h02_45.Cricket (h02_45.Cricket.java)
//
// DESCRIPTION
// h02_45.Cricket is a subclass of h02_45.Insect. Remember that if D is a subclass of C, then
// a D is a specific type of C, so h02_45.Cricket is a specific type of h02_45.Insect.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * h02_45.Cricket is a specific type of h02_45.Insect so h02_45.Cricket inherits from h02_45.Insect. h02_45.Insect
 * and h02_45.Cricket are related using a generalization (or inheritance) relationship.
 * Note that h02_45.Insect implements the h02_45.MakesSound interface, so since h02_45.Cricket is a
 * subclass of h02_45.Insect then h02_45.Cricket must implement the h02_45.MakesSound interface b
 * implementing the h02_45.MakesSound.makeSound() method. (If h02_45.Cricket does not do this,
 * then h02_45.Cricket also becomes an abstract class).
 */
public class Cricket extends Insect {

    /**
     * h02_45.Insect is an abstract class and does not implement the h02_45.MakesSound.
     * makeSound() method. However, since h02_45.Cricket is a concrete subclass of
     * h02_45.Insect then h02_45.Cricket must implement makeSound(). The sound Crickets make
     * is "Chirp" (Man oh man, I hate crickets).
     *
     * Note also that h02_45.Cricket is implementing the abstract makeSound() method
     * of h02_45.Insect. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Chirp");
	}
}
