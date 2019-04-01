package h02_45;//******************************************************************************
// ABSTRACT CLASS: h02_45.Mammal (h02_45.Mammal.java)
//
// DESCRIPTION
// h02_45.Mammal is the abstract superclass for all h02_45.Mammal subclasses, e.g., we could
// have a h02_45.Dog class, a h02_45.Cat class, and a Cow class, all of which inherit from
// h02_45.Mammal. The h02_45.Mammal class implements the h02_45.MakesSound interface because each
// h02_45.Mammal makes a sound of some sort (we assume so, I don't know if all Mammals
// make sounds).
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * The abstract superclass for all types of Mammals. Note that h02_45.Mammal does not
 * implement h02_45.MakesSound.makeSound() because it does not have to since h02_45.Mammal
 * is abstract. Abstract classes do not have to implement any of the methods of
 * the class.
 */
public abstract class Mammal implements MakesSound {

} 
