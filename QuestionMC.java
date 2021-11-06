/*
   @Author:  James Sherwood
   @version 11/5/2021
   TCSS 143 A
   Professor Sakpal
   Description: Class QuizBowl to read from sample.txt file and play quiz
*/

import java.util.*;

public class QuestionMC extends Question{
    private ArrayList<String> mcAnswers;
    private String answer;
    private char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F','G','H', 'I'};

    // Constructor
    public QuestionMC(String question, int point, ArrayList<String> mcAnswers, String answer){
        super(question, point);
        this.mcAnswers = mcAnswers;
        this.answer = answer;
    }

    // Methods
    /*
        Method: Access the answer field
        Param: none
        Return: String
     */
    public String getAnswer(){
        return this.answer;
    }

    /*
        Method: Override toString()
        Param: none
        Return: String
     */
    public String toString(){
        String selections = super.getQuestion() + "\n";
        for (int i = 0; i < mcAnswers.size(); i++){
            selections += alphabet[i] + ") " + mcAnswers.get(i) + "\n";
        }
        return selections;
    }


}
