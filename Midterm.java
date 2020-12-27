package mid;

import java.util.Scanner;
import java.util.ArrayList;

public class Midterm {
    
    public static Scanner midterm = new Scanner(System.in); 
    public static ArrayList<String> nameee = new ArrayList<>(); //list for names
    public static ArrayList<Integer> ageee = new ArrayList<>();  // list for ages

    //Delete Entry
    static void View(ArrayList<String> enter, ArrayList<Integer> hehehe) {
        System.out.println("====== Delete Entry ======");

        System.out.print("Enter a Name to Delete: ");
        String aname = midterm.next();

        if (enter.contains(aname)) {
            for (int i = 0; i < enter.size(); i++) {
                if (aname.equals(enter.get(i))) {
                    System.out.println(enter.get(i) + " was deleted from the list");
                        enter.remove(i);
                        hehehe.remove(i);
                            break;}}} 
                else {
                    System.out.println("No " + aname + " in the list");}
                seap(enter, hehehe);}
    
         //Add entry (name, age)
    static void Delete(ArrayList<String> enter, ArrayList<Integer> hehehe) {
        System.out.println("======= Add Entry ========");
        System.out.print("\nEnter Name: ");
        String name = midterm.next();
        enter.add(name);

        System.out.print("Enter Age: ");
        int age = midterm.nextInt();
        hehehe.add(age);
        seap(enter, hehehe);}
    
        //Update
    static void Exit(ArrayList<String> enter, ArrayList<Integer> hehehe) {
        System.out.println("====== Update an Entry=======");

        System.out.print("\nEnter a Name to Update: ");
        String edit = midterm.next();

        if (enter.contains(edit)) {
            for (int i = 0; i < enter.size(); i++) {
                if (edit.equals(enter.get(i))) {
                    System.out.print("\nEnter New Name: ");
                    String thename = midterm.next();
                    enter.set(i, thename);
                    System.out.print("Enter New Age: ");
                    int middd = midterm.nextInt();
                    hehehe.set(i, middd);
                    break;}}} 
                else {
                    System.out.println("No " + edit + " in the list");}
                seap(enter, hehehe);}
    
    //View all entries
    static void Update(ArrayList<String> enter, ArrayList<Integer> hehehe) {
        System.out.println("====== View All Entries =======");

        for (int i = 0; i < enter.size(); i++) {
            System.out.println("\n"+enter.get(i) + " is " + hehehe.get(i));}
        seap(enter, hehehe);}

    //Exit 
    static void Add(ArrayList<String> enter, ArrayList<Integer> hehehe) {
        System.out.println("Termination Complete");
        System.out.println("");
        System.exit(0);
        return;
    }
    //OUPUT 
    static void seap(ArrayList<String> nameee, ArrayList<Integer> ageee) {

        System.out.println("                        MIDTERM EXAM                       \n" +
                           "               Object Oriented Programming                 \n" +
                           "               Elaisha D. Diana BSCS 2B AI                 \n" +
                         
                "\nOptions"+
                    "\n1. Add entry"+
                    "\n2. Delete entry"+
                    "\n3. View all entries"+
                    "\n4. Update"+
                    "\n0. Exit");

        int input = 0;
        System.out.print("Select an option: ");
        try {
            input = midterm.nextInt();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Invalid keyword");
            System.exit(0);
        }
        switch (input) {

            case 0:
                Add(nameee, ageee);
            case 1:
                Delete(nameee, ageee);
            case 2:
                View(nameee, ageee);
            case 3:
                Update(nameee, ageee);
            case 4:
                Exit(nameee, ageee);
            default: {
                System.out.println("Invalid input, please try again");
                seap(nameee, ageee);
            } 
        }        
    }



    public static void main(String[] args) {
        seap(nameee, ageee);

    }
    
}
