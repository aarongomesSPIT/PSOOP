
/**
 * Write a description of class Player here.
 *
 * @author Aaron Gomes
 * @version 17/04/26
 */
abstract class Player
{
    // Methods to be overriden
    int getGuess(){
        return -1;
    }
    
    // Define a method if a player wins
    abstract void win();
}