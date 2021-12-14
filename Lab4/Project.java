/*
*James Sherwood
* version: 10/21/2021
* TCSS 143
* Author: Raghavi Sakpal
* Description: Driver program for Lab 4
 */
public class Project {
    //Instance fields
    private int linesOfCode; //number of lines of code the project requires
    private int duration;    //project duration days
    private int daysWorkedSoFar;    //days spent working on project
    private Employee[] empArr = new Employee[50]; //Array of employees

    // Instance field to keep tab of the index location
    private int index = 0;

    //Constructor
    public Project(int linesOfCode, int duration, int maxEmployees){
        this.linesOfCode = linesOfCode;
        this.duration = duration;
        daysWorkedSoFar = 0;
        empArr = new Employee[maxEmployees];
    }
    /*
    Method: To add an employee to the project
    Param: Employee
    Return: Void
     */
    public void addEmployee(Employee e){
        empArr[index] = e;
        index++;
    }
    /*
        Method: Loops through empArr, calling .work on each employee until all lines of code are written and tested.
        Param: None
        Return: void
     */
    public void doProject(){

        int linesCoded = 0;
        int linesTested = 0;
        while (linesCoded <= linesOfCode && linesTested <= linesOfCode) {
            for (int i = 0; i < this.index; i++) {
                if (empArr[i] instanceof Programmer) {
                    linesCoded += empArr[i].work();
                } else {
                    linesTested += empArr[i].work();
                }
            }
            daysWorkedSoFar++;
        }
    }

    //@override toString() method
    public String toString() {
        String str = "Duration: " + duration + "\nDays required: " + daysWorkedSoFar
                + "\nEmployees on Project: \n";
        // Loop through the employee array
        for(int i = 0; i < this.index; i++){
            str += empArr[i];
        }
        return str;
    }
    //Main method
    public static void main(String[] args) {
        Project p = new Project(10000, 12, 10);
        p.addEmployee(new Programmer("Rosaline Barcia", 148));
        p.addEmployee(new Programmer("Clint Earls", 62));
        p.addEmployee(new Programmer("Arlette Cormack", 105));
        p.addEmployee(new Programmer("Charles Odem", 75));
        p.addEmployee(new Tester("Shon Selle", 132));
        p.addEmployee(new Tester("Garth Goates", 127));
        p.addEmployee(new Tester("Jacinto Farrah", 114));

        // Call to work on project
        p.doProject();

        // Print results of the project
        System.out.println(p);
    }
}
