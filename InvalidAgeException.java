/** 
* TITLE: InvalidAgeException.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 9
* PROJECT: Lab 13
* LAST MODIFIED: 10/28/2020
* DESCRIPTION: InvalidAgeException class declaration. 
*
* ALGORITHM: 
* declare public class InvalidAgeException extends Exception

* 
* PACKAGES INCLUDED: no 
*/   

public class InvalidAgeException extends Exception{
     /**
     * No arguments constructor
     */
    public InvalidAgeException(){
        super("Invalid age. Age has to be at least 1 year.");
    }
    /**
     * One argument constructor, message
     */
    public InvalidAgeException(String message){
        super(message);
    }

}
    


