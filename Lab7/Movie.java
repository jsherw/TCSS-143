/*
   TCSS 143
   Author: Your name 
   Description: Movie Object Class
*/

public class Movie 
{
   // Variable to store Movie Title 
   private String title;
   // Variable to store Movie release date
   private int year;
   
   // Default Constructor   
   public Movie() 
   {
      this.year = 0;
      this.title = "";
   }
   
   // Constructor: create an instance of Movie with parameter Title & Release Year 
   public Movie(String title, int year) 
   {
      this.title = title;
      this.year = year;
   }
   
   // Method: Return Movie Title    
   public String getName()
   {
      return title;
   }
   
   // TO DO: @verride toString() method to return String representation of Movie info (Title & Year) 
   public String toString()
   {
      // Add the code for toString() here.
      return Integer.toString(year); // Make sure you replace 
                                     // this return statement.
   }
    
   /*
      TO DO
      Method: To compare this instance of Movie with Movie parameter to see if they are equal (title & release date).
      Parameter: Object obj
      Return: boolean true/or false
   */  
   public boolean equals( Object obj )
   {
      // Add the code for equals() here.
      return true; // Make sure you replace this return statement.
   }
   
   /*
      TO DO
      Method: To compare this instance of Movie with Movie parameter to return <, > or == based on relsease date
              If release year is same then compare based on Movie Title.
      Parameter: Object obj
      Return: int
   */   
   public int compareTo( Object obj )
   {
      // Add the code for compareTo() here.
      return (int)year; // Make sure you replace this 
                        // return statement.
   }
}
