/*
   TCSS 143
   Add your name, date and description
*/
public class Animal {
	
	private String name;
	private int topSpeed;	
   //TO DO: Add a constructor that takes in a String for the name and an int for the topSpeed
	//       use only the set methodsinitialize the instance variables
	public Animal(String name, int topSpeed){
		setName(name);
		setTopSpeed(topSpeed);
	}

	//Methods

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	/*
		Method: Determines if topSpeed is in range, sets topSpeed.
		Param: int
		return: none
	 */
	public void setTopSpeed(int topSpeed) throws IllegalArgumentException{
		if (topSpeed >= 0 && topSpeed <= 70){
			this.topSpeed = topSpeed;
		}
	}
	public int getTopSpeed(){
		return this.topSpeed;
	}
	
	//TO DO: Add an equals(Object other) method that returns True if the two Animal objects have 
	//       top speeds that are within 2 mph of each other
	/*
		Method: Overrides default equals method
		Param: Object o
		Return: Boolean
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Animal) {
			Animal a = (Animal) o;
			return Math.abs(this.topSpeed - a.topSpeed) <= 2;
		} else{
			return false;
		}
	}
	/*
		Method: Overrides toString()
		Param: none
		Return: String
 	*/
	@Override
	public String toString() {
		return "Name: " + name  + "\n" +
				"Top Speed: " + topSpeed;
	}
}
