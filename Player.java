/*
   @Author:  James Sherwood
   @version 11/5/2021
   TCSS 143 A
   Professor Sakpal
   Description: Class QuizBowl to read from sample.txt file and play quiz
*/

public class Player {

    // Fields
    private String firstName = "";
    private String lastName = "";

    public int playerScore;

    //Constructor
    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerScore = 0;
    }

    // Methods

    /*
        Method: Access firstName field
        Param: none
        Return: String
     */
    public String getFirstName(){
        return this.firstName;
    }
    /*
        Method: Access lastName field
        Param: none
        Return: String
     */
    public String getLastName(){
        return this.lastName;
    }
    /*
        Method: Access playerScore field
        Param: none
        Return: none
     */

    public int getPlayerScore() {
        return this.playerScore;
    }
    /*
        Method: Update player score with point values
        Param: int
        Return: void
     */
    public void updatePlayerScore(int point){
        this.playerScore += point;
    }
    /*
        Method: Override toString()
        Param: none
        Return: String
     */
    public String toString(){
        return "" + getFirstName() + " " + getLastName() + ", your game is over! " +
                "\nYour final score is " +getPlayerScore() + "points." +
                "\nBetter luck next time!";
    }
}
