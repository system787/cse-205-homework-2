package h02_45;

//******************************************************************************
// CLASS: h02_45.Frog (h02_45.Frog.java)
//
// DESCRIPTION
// h02_45.Frog is a subclass of h02_45.Amphibian
//
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu
//******************************************************************************
public class Frog extends Amphibian {

    /**
     * makeSound()
     *
     * Prints the sound that a h02_45.Frog would make. Method overridden from MakeSound interface
     * implemented in parent class h02_45.Amphibian
     */
    @Override
    public void makeSound() {
        System.out.println("Ribbet");
    }
}
