/*
 * @author James Sherwood jamessh@uw.edu
 * @version 10 October 2021
 * Instructor: Professor Sakpal
 * TCSS 143 (Fall 2021)
 */

import java.util.*;
public class SweeperGame {

    //fields
    private char[][] gameBoard; //Creates 2D char array for Game Board.
    private int treasureX;      // Stores horizontal location of treasure.
    private int treasureY;      // Stores vertical location of treasure.
    private int totalMoves;     // counts total player guesses.
    private boolean found;      // shows true when treasure is found.

    //constructor

    public SweeperGame(int height, int width) throws IllegalArgumentException{

        // 2D char array is initialized to user specifications and filled with empty values.
        this.gameBoard = new char[height][width];
        for (int i = 0; i < this.gameBoard.length; i++){
            for (int j = 0; j < this.gameBoard[i].length; j++){
                    this.gameBoard[i][j] = ' ';
                }
            }

        //creates random object, supplies random coordinates of treasure.
        Random rand = new Random();
        this.treasureX = rand.nextInt(width);
        this.treasureY = rand.nextInt(height);

        gameBoard[treasureY][treasureX] = 'T';
        totalMoves = 0;
        found = false;
    }

    // Methods

    /**
     * determines if space has been swept previously.
     *
     * @param x is the user's x-coordinate.
     * @param y is the user's y-coordinate.
     * @return false is the space has not been swept previously.
     */
    public boolean beenSwept (int x, int y){
        if (gameBoard[y][x] == ' ' || gameBoard[y][x] =='T'){
            return false;
        } else{
            return true;
        }
    }
    /**
     * Determines if treasure is found at user's coordinates.
     *
     * @param x is the user's x-coordinate.
     * @param y is the user's y-coordinate.
     *
     * @return true if treasure is found.
     */
    public boolean treasureFound(int x, int y){
        if(gameBoard[y][x] == 'T'){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Determines if user's coordinates are within the parameters of the 2D array.
     *
     * @param x is user's x-coordinate.
     * @param y is user's y-coordinate.
     *
     * @return true if user's coordinates are within game board parameters.
     */
    public boolean checkOutOfBounds(int x, int y){
        if (x < gameBoard.length && y < gameBoard[0].length){
            return true;
        } else{
            return false;
        }
    }
    /**
     * @return game board column length.
     */
    public int getBoardHeight(){

        return gameBoard[0].length;
    }

    /**
     * @return game board row length.
     */
    public int getBoardWidth(){

        return gameBoard.length;
    }


    /**
     * @return number of total moves.
     */
    public int getTotalMoves(){

        return this.totalMoves;
    }

    /**
     *  Checks array at specified coordinates.
     *  If treasure is not found, calculates Manhattan distance.
     *  Updates array to contain the Manhattan distance from treasure at that point.
     *
     * @param x user's x-coordinate.
     * @param y user's y-coordinate.
     *
     * @return true if treasure is found.
     */
    public boolean digSand(int x, int y){
        if (treasureFound(x, y)){
            this.totalMoves++;
            found = true;
            return true;
        } else{
            int temp = (Math.abs(y - treasureY)) + (Math.abs(x - treasureX));
            this.gameBoard[y][x] = Integer.toString(temp).charAt(0);
            this.totalMoves++;
            return false;
        }
    }

    /**
     * Creates a StringBuilder object to display the game board to the user.
     *
     * @return StringBuilder object.
     */
    @Override
    public String toString(){
        StringBuilder printBoard = new StringBuilder();

        // creates top border
        printBoard.append("+");
        for (int line = 0; line < gameBoard.length; line++){
            printBoard.append("-+");
        }

        // Creates the game board, and hides "T" if treasure is not found.
        printBoard.append("\n");
        for (int i = getBoardHeight() - 1; i + 1 > 0; i--){
            printBoard.append("|");
            for (int j = 0; j < gameBoard[i].length; j++){
                if (gameBoard[i][j] == 'T' && !found){
                    printBoard.append(' ' + "|");
                } else{
                    printBoard.append(gameBoard[i][j] + "|");
                }
            }
            printBoard.append("\n");
        }

        // Creates a border along bottom of game board.
        printBoard.append("+");
        for (int line = 0; line < gameBoard.length; line++){
            printBoard.append("-+");
        }

        return printBoard.toString();
    }
}