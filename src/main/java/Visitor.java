import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Visitor {

    String FullName;
    int age;
    String dateOfVisit;
    String timeOfVisit;
    String comments;
    String nameOfVisitorAssistance;

    public Visitor(String fullName, int age, String dateOfVisit, String timeOfVisit, String comments, String nameOfVisitorAssistance) {
        FullName = fullName;
        this.age = age;
        this.dateOfVisit = dateOfVisit;
        this.timeOfVisit = timeOfVisit;
        this.comments = comments;
        this.nameOfVisitorAssistance = nameOfVisitorAssistance;
    }

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

public void save()
{
    try{
        File visitor = new File("visitor_alice_cooper.txt");
        if(visitor.createNewFile())
        {
            logger.info("File " + visitor.getName() + " successfully created");
        }
        else{
            logger.debug("File already exists");
        }

        FileWriter writer = new FileWriter("visitor_alice_cooper.txt");
        writer.write("Full name: " + this.FullName + "\n");
        writer.write("Age: " + this.age + "\n");
        writer.write("Date of visit: " + this.dateOfVisit + "\n");
        writer.write("Time of visit: " + this.timeOfVisit +"\n");
        writer.write("Comments: " + this.comments + "\n");
        writer.write("Name of person who assisted the visitor: " + this.nameOfVisitorAssistance +"\n");
        writer.close();

    } catch (IOException e) {
        logger.error("An error has occurred!!!");
        e.printStackTrace();
    }

}

public void load(String name)
{

    String Name = "visitor_" + name.replace(" ", "_").toLowerCase();
    try {
        File read1 = new File("visitor_alice_cooper.txt");
        Scanner reader1 = new Scanner(read1);
        while(reader1.hasNextLine()){
            String alice_info = reader1.nextLine();
            System.out.println(alice_info);
        }

        System.out.println("-------------------------------------");

    } catch (FileNotFoundException e) {
        logger.error("File Not found");
        e.printStackTrace();
    }
}

}
