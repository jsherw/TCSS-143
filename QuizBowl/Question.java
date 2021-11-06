/*
   @Author:  James Sherwood
   @version 11/5/2021
   TCSS 143 A
   Professor Sakpal
   Description: Class QuizBowl to read from sample.txt file and play quiz
*/
public abstract class Question {

    // instance fields
    private String question = "";
    private int point;

    //Constructor
    public Question(String question, int point){
        this.question = question;
        this.point = point;
    }

    //methods
    /*
        Method: Defined in subclass
        Param: none
        Return: String
     */
    abstract String getAnswer();

    /*
        Method: Access the "question" field
        Param: none
        Return: String
     */
    public String getQuestion(){
        return this.question;
    }
    /*
        Method: Access the "point" field
        Param: none
        Return int
     */
    public int getPoints(){
        return this.point;
    }

    /*
        Method: @Override default toString()
        Param: none
        Return: String
     */
    public String toString(){
        return "Points: " + getPoints() + "\nQuestion: " + getQuestion();
    }

}
