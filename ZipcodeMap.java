/*
    @author James Sherwood
    @version 11/4/2021
    TCSS 143
    Professor Sakpal
 */
import java.util.*;
import java.io.*;
public class ZipcodeMap {
    public static void main(String[] args)  throws FileNotFoundException {
        //  Declare Scanner to read file
        Scanner scnr = new Scanner(new File("us-500.csv"));

        //  Declare TreeMap to store data from file
        Map<String, List<String>> zipcodes = new HashMap<String, List<String>>();

        while (scnr.hasNextLine()) {
            List<String> info = new LinkedList<>();
            String line = scnr.nextLine();
            String[] str = line.split(",");
            for (int i = 0; i < str.length; i++){
                    info.add(str[i]);
            }
            zipcodes.put(str[8],info);
        }

        //  Method calls

        searchKey(zipcodes);
        duplicateValues(zipcodes);
    }

    //  Methods

    /*
        Method: Prompts user for a key, displays information related to that key
        Param: Map<String, String>
        Return: None
     */
    public static void searchKey(Map<String, List<String>> zipcodes){
        // Declare scanner to read user input
        Scanner scnr1 = new Scanner(System.in);

        System.out.println("Enter Phone Number: ");
        String phoneNum = scnr1.nextLine();
        if (zipcodes.containsKey(phoneNum)){
            System.out.println("First_Name: " + zipcodes.get(phoneNum).get(0));
            System.out.println("Last_Name: " + zipcodes.get(phoneNum).get(1));
            System.out.println("Company_Name: " + zipcodes.get(phoneNum).get(2));
            System.out.println("Address: " + zipcodes.get(phoneNum).get(3));
            System.out.println("City: " + zipcodes.get(phoneNum).get(4));
            System.out.println("County: " + zipcodes.get(phoneNum).get(5));
            System.out.println("State: " + zipcodes.get(phoneNum).get(6));
            System.out.println("Zipcode: " + zipcodes.get(phoneNum).get(7));
            System.out.println("Phone 2: " + zipcodes.get(phoneNum).get(9));
            System.out.println("Email: " + zipcodes.get(phoneNum).get(10));
        }


    }

    /*
        Method: Finds people in the same state
        Param: Map<String, String>
        Return: none
     */
    public static void duplicateValues(Map<String, List<String>> zipcodes) {
        Set<String> values = zipcodes.keySet();             // Create a set from the map for iteration
        ArrayList<String> dupes = new ArrayList<>();        // Contains keys of states that are duplicated
        Iterator<String> itr = values.iterator();
        ArrayList<String> numbers = new ArrayList<>();      // Holds unique identifiers
        ArrayList<String> states = new ArrayList<>();       // Used to hold unique instances of states

        //Iterate through keys in values Set, add keys of duplicates to ArrayList
        while(itr.hasNext()){
            String key = itr.next();
            String state = zipcodes.get(key).get(6);
            for(Map.Entry<String, List<String>> i: zipcodes.entrySet()){
                if (i.getValue().contains(state) && !dupes.contains(i.getKey()) && !key.equals(i.getKey())){
                    dupes.add(i.getKey());
                }
            }
        }
        // Loop through dupes ArrayList, each time a recurring state is called, print info on people who live there.
        // Ignore states with one resident.
        for (int i = 0; i <dupes.size(); i++){
            String key = dupes.get(i);
            String state = zipcodes.get(dupes.get(i)).get(6);
            if (!states.contains(state)){
                System.out.println(state);
                for (int j = 0; j < dupes.size(); j++){
                    String key2 = dupes.get(j);
                    if (zipcodes.get(key2).get(6).equals(state)){
                        if (!numbers.contains(zipcodes.get(key2).get(8))) {
                            System.out.println(zipcodes.get(key2).get(0) + " " + zipcodes.get(key).get(1));
                            numbers.add(zipcodes.get(key2).get(8));
                        }

                        states.add(state);
                    }
                }
                System.out.println();
            }
        }

    }
}
