/*
   TCSS 143
   Add your name, date and description
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class GuinnessBook {

	private ArrayList<Animal> landAnimals;

	public GuinnessBook(String filename) throws FileNotFoundException{

		landAnimals = new ArrayList<Animal>();

		File animalFile = new File(filename);
		Scanner scan = new Scanner(animalFile);
		
		while(scan.hasNextLine()){
			String[] animalInfo = scan.nextLine().split(" ");
			String animalName = "";
			
			for(int i = 0; i < (animalInfo.length-1); i++){
				animalName += animalInfo[i] + " ";
			}
			animalName = animalName.trim();
			Integer topSpeed = Integer.parseInt(animalInfo[animalInfo.length-1]);

			//TO DO: insert the animal into the arraylist here, don't change any of the above code
			Animal temp = new Animal(animalName, topSpeed);
			landAnimals.add(temp);
		}
		scan.close();
	}

   // TO DO: Finish the implementation of the toString() method
	public String toString(){
		String str = "";
		for (int i = 0; i < landAnimals.size(); i++){
			str += landAnimals.get(i).toString() + "\n";
		}
		//System.out.println("toString() NOT IMPLEMENTED");
		return str;
	}

	private void testGuinnessBook() throws FileNotFoundException {

        // uncomment the println statements to  find animals whose speed is within
        // 2mph of a given speed

         System.out.println("Is there an animal whose speed is around 70mph? " + landAnimals.contains(new Animal("fast animal", 70)));
         System.out.println("Is there an animal whose speed is around 35mph? " + landAnimals.contains(new Animal("slow animal", 35)));
         System.out.println();
            
        // The success of the above two statements depends on correct implementation of an equals method in the Animal class
                    
        // If we would like to know which animal it is:
         System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("fast animal", 70))));
         System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("slow animal", 35))));
         System.out.println();

    }

    public static void main(String[] args) throws FileNotFoundException {

        // Once Animal.java is completed and GuinnessBook has a working toString,
        // uncomment the next two lines to test the constructor and toString
        // Pass the filename as an argument (jGrasp -> Build -> Run Arguments)
         GuinnessBook records = new GuinnessBook("src/animalList.txt");
         System.out.println(records);

        // Next, uncomment the following line and lines from testGuinnessBook to test your
		//Animal class equals method
         records.testGuinnessBook();
    }

}

