
/**
 * Write a description of class MyGame here.
 *
 * @author Aaron Gomes
 * @version 17/04/26
 */

import java.io.*;
public class MyGame implements Game
{
    Player p1;
    Player p2;
    public void play(){
        int p1c = p1.getGuess(); //Store the choice of the player 1
        int p2c = p2.getGuess();//Store the choice of the player 2
        
        // Game logic
        if((p1c == 1 && p2c == 0) || (p1c == 2 && p2c == 1) || (p1c == 0 && p2c == 2) )p1.win();
        else p2.win();
        
        
    }
    
    MyGame(Player p1, Player p2){
        this.p1 = p1; //Set the players
        this.p2 = p2;
        
        play(); // Start the game
    }
}