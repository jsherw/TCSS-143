/*
   @Author:  James Sherwood
   @version 11/5/2021
   TCSS 143 A
   Professor Sakpal
   Description: Class QuizBowl to read from sample.txt file and play quiz
*/
public class QuestionTF extends Question {

    //fields
    private String answer = "";

    //Constructor
    public QuestionTF(String question, int point, String answer){
        super(question, point);
        this.answer = answer;
    }

    //Methods
    /*
        Method: Access "answer" field
        Param: none
        Return: String
     */
    public String getAnswer(){
        return this.answer;
    }

}
