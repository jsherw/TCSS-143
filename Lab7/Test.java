import java.util.*;

/*
   TCSS 143
   Author: Your name 
   Description: Movie Object Class
*/

public class Test 
{
   /*
     This is the main method for this test program. Since this is a
     simple test program, all of our code will be in the main method.
     Typically this would be a bad design, but we are just testing out
     some features of Java.
     Steps:
     1. Instantiate eight objects of type Movie and add them to the list movies.
     2. Print out the unsorted list of movies.
     3. Sort the list of movies using Collections.sort().
     4. Print out the sorted list of movies.
     5. Search for a particular movie in the list.
     6. Test your equals method.
   */
   public static void main(String[] args) 
   {
      List movies = new ArrayList();
        
      /* To Do:
       1. Instantiate eight objects of type Movie and add them to the list movies. 
          I have created and added the first movie for you. :)
      */        
      Movie movie1 = new Movie( "Short Circuit", 1986 );
      movies.add(movie1);

        
      /*
       2. Print out the unsorted list of movies.
       This uses an iterator to "iterate" through the list.
      */
      System.out.println( "\n\nUnsorted List" );
      
      Iterator iterator = movies.iterator();
  
      while( iterator.hasNext() )
      {
         // Note: This line of code will call toString of the Movie class.
         System.out.println( iterator.next() );
      }
        

      /* To Do: 
       3. Sort the list of movies using Collections.sort().
      */
      
      // ADD CODE TO SORT HERE
        
        
      /* To Do:
       4. Print out the sorted list of movies.
      */
      System.out.println( "\n\nSorted List" );
      /* HINT: Use an iterator the same way I used one above when
         the unsorted list of movies was printed.
      */
        
      // ADD CODE TO PRINT THE LIST HERE     
   
        
      /* To Do: 
        5. Search for a particular movie in the list.
       */
      System.out.println( "\n\nSearching" );
      Movie key = new Movie( "Short Circuit", 1986 );
      System.out.println( "Key is " + key );
        
      /*
         Call Collections.binarySearch() to find the index of key.  
         Make sure you test the value of index to see if it negative, 
         which indicates that the key was not found in the list.
       */
      int index = Collections.binarySearch( movies, key );
        
      /* 
         Print out whether the movie was found or not and the index at which it was found.
         HINT: If index is negative print a statement saying that the
               movie searched for is not in the list.  Otherwise, print
               out a statement telling that the movie was found in the list
               and give the index of the movie in the list as well.
      */
       
      // ADD CODE HERE
                
        
      /* To Do: 
        6. Test your equals method.
      */
      System.out.println( "\n\nTesting Equals" );
      Movie someMovie = new Movie( "Short Circuit", 1986 );
      Movie anotherMovie = new Movie( "Terminator", 1984 );
        
      if(key.equals(someMovie))
      {
         /*
            Add code here to inform the user that the 
            movies key and someMovie are equal.
         */
      }
        
      if(!key.equals(anotherMovie))
      {
         /*
            Add code here to inform the user that the movies key 
            and anotherMovie are not equal.
         */
      }   
   }
}
