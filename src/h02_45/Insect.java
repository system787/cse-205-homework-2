package h02_45;//******************************************************************************
// ABSTRACT CLASS: h02_45.Insect (h02_45.Insect.java)
//
// DESCRIPTION
// h02_45.Insect is the abstract superclass for all h02_45.Insect subclasses, e.g., we could
// have a LadyBug class, a Cockroach class, and a h02_45.Cricket class, all of which
// inherit from h02_45.Insect. The h02_45.Insect class implements the h02_45.MakesSound interface
// because each h02_45.Insect makes a sound of some sort (we assume so, I don't know if
// all Insects make sounds).
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * The abstract superclass for all types of Insects. Note that h02_45.Insect does not
 * implement h02_45.MakesSound.makeSound() because it does not have to since h02_45.Insect
 * is abstract. Abstract classes do not have to implement any of the methods of
 * the class.
 */
public abstract class Insect implements MakesSound { 
} 
