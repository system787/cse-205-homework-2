package h02_45;//******************************************************************************
// CLASS: h02_45.Bee (h02_45.Bee.java)
//
// DESCRIPTION
// h02_45.Bee is a subclass of h02_45.Insect
//
// AUTHOR: Vincent Hoang, vnhoang, vnhoang@asu.edu
//******************************************************************************

public class Bee extends Insect {

    /**
     * makeSound()
     *
     * Prints the sound that a bee would make. Method overridden from MakeSound interface
     * implemented in parent class h02_45.Insect
     */
    @Override
    public void makeSound() {
        System.out.println("Buzz");
    }
}
