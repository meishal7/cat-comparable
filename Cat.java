
/** 
* TITLE: Cat.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 9
* PROJECT: Lab 13
* LAST MODIFIED: 10/28/2020
* DESCRIPTION: defins public class Cat implements Comparable
*
* ALGORITHM:
* 
*/
import java.util.Objects;
import java.lang.*;

public class Cat implements Comparable {

    /**************************** INSTANCE VARS ***************************/
    private String name;
    private String breed;
    private int age;

    /**************************** CONSTRUCTORS ***************************/

    /**
     * No arguments constructor
     */
    public Cat() {
    }

    /**
     * Three arguments constructor
     * 
     * @param name
     * @param breed
     * @param age
     * @throws InvalidAgeException
     */
    public Cat(String name, String breed, int age) throws InvalidAgeException {
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    /**
     * Copy constructor
     * 
     * @param original original obj
     */
    public Cat(Cat original) {
        if (original == null) {
            System.out.print("Fatal error.");
            System.exit(0);
        }
        name = original.name;
        breed = original.breed;
        age = original.age;
    }

    /**************************** GETTERS AND SETTERS ***************************/

    /**
     * Sets the name
     * 
     * @param name name for set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the breed
     * 
     * @param breed for set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets age
     * 
     * @param age age for set
     * @throws InvalidAgeException
     */
    public void setAge(int age) throws InvalidAgeException {
        if (age < 1) {
            throw new InvalidAgeException();
        }
        this.age = age;
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /************************************
     * EQUALS() toSTRING() hashCODE()
     **************************************/
    /**
     * Prints out the object data
     */
    public String toString() {
        return ("[Cat: name=" + name + ", Breed=" + breed + ", Age=" + age + ", Human Age=" + ageInHumanYears() + "]");
    }

    /**
     * Tests for equality of two objects. To be equal objects must have the same
     * name, breed, age
     * 
     * @return returns true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Cat that = (Cat) o;
        return Integer.compare(that.age, age) == 0 && name.equals(that.name) && breed.equals(that.breed);
    }

    /**
     * Returns hash code value for the obj
     * 
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age);
    }

    /************************************
     * OTHER METHODS
     **************************************/
    /**
     * Computes cat age in human years
     * @return int age in human years
     */
    public int ageInHumanYears() {
        int humanAge = 0;
        
        if (age == 1) {
            humanAge = 15;
        }
        if (age == 2) {
            humanAge = 24;
        }
        if (age >= 3) {
            int count = 0;
            humanAge = 24;
            while (count != (age - 2)) {
                humanAge += 4;
                count++;
            }
        }
        return humanAge;
    }
    /**
     * Sorts collection by obj name property
     * @param o
     * @return returns sorted collection of objects
     */
    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Cat) o).getName());
    }

}