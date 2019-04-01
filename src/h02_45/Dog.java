package h02_45;//******************************************************************************
// CLASS: h02_45.Dog (h02_45.Dog.java)
//
// DESCRIPTION
// h02_45.Dog is a subclass of h02_45.Mammal. Remember that if D is a subclass of C, then a D
// is a specific type of C, so h02_45.Dog is a specific type of h02_45.Mammal.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * h02_45.Dog is a specific type of h02_45.Mammal so h02_45.Dog inherits from h02_45.Mammal. h02_45.Mammal and h02_45.Dog
 * are related using a generalization (or inheritance) relationship. Note that
 * h02_45.Mammal implements the h02_45.MakesSound interface, so since h02_45.Dog is a subclass of
 * h02_45.Mammal then h02_45.Dog must implement the h02_45.MakesSound interface by implementing the
 * h02_45.MakesSound.makeSound() method. (If h02_45.Dog does not do this, then h02_45.Dog also becomes
 * an abstract class).
 */
public class Dog extends Mammal {

    /**
     * h02_45.Mammal is an abstract class and does not implement the h02_45.MakesSound.
     * makeSound() method. However, since h02_45.Dog is a concrete subclass of h02_45.Mammal
     * then h02_45.Dog must implement makeSound(). The sound Dogs make is "Bark".
     *
     * Note also that h02_45.Dog is overridng the abstract makeSound() method
     * of h02_45.Mammal. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Bark");
	} 
} 
