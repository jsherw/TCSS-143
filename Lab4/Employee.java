/*
 * @author James Sherwood
 * @version: 10/21/2021
 * TCSS 143
 * Professor Sakpal
 */
public abstract class Employee {
    // Instance fields
    private String name = "";   // Employee's name
    private static int idNum;   // Tracks number of employees
    public int uniqueID;        // Assigns employee number to each new object
    private int code;           // Average productivity of employee

    //Constructor

    public Employee(String name, int code){
        this.name = name;
        this.code = code;
        this.idNum += 1;
        uniqueID = getIDNum();
    }

    // Abstract method to be implemented by Programmer and Tester classes
    abstract int work();

    //get methods
    public String getName(){
        return name;
    }
    public int getIDNum(){
        return idNum;
    }
    public int getCode(){
        return code;
    }
    //@ override toString
    public String toString(){
        return "Employee ID: " + uniqueID +",Employee Name: "+ getName() + ",Average productivity: " + getCode() + "\n";
    }
}
