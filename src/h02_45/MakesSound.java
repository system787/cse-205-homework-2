package h02_45;//******************************************************************************
// INTERFACE: h02_45.MakesSound
//
// DESCRIPTION
// This interface declares one method makeSound() which is implemented in classes
// which implement this interface. The intent of makeSound() is to print the
// sound an object makes, for example a h02_45.Dog object may print "Bark" and a Tree
// object may print "Crash".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * Represents a sound made by some object.
 */
public interface MakesSound { 
	public void makeSound(); 
} 
