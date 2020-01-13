import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Visitor {
private static final Logger logger = LogManager.getLogger(Main.class.getName());

public void save()
{
    try{
        File visitor = new File("visitor_alice.txt");
        if(visitor.createNewFile())
        {
            logger.info("File " + visitor.getName() + " successfully created");
        }
        else{
            logger.error("File already exists");
        }

    } catch (IOException e) {
        logger.error("An error has occurred!!!");
        e.printStackTrace();
    }

    try{

        File visitor2 = new File("visitor_bob_marley.txt");
        if(visitor2.createNewFile())
        {
            logger.info("File " + visitor2.getName() + " successfully created");
        }
        else
        {
            logger.error("File already exists");
        }

        FileWriter writer = new FileWriter("visitor_bob_marley.txt");
        writer.write("Full name: Bob Marley");
        writer.write("Age: 34");
        writer.write("Date of visit: 25/10/2020");
        writer.write("Time of visit: 13h00");
        writer.write("Comments: No comment");
        writer.write("Staff name: Victoria Secrets");
        writer.close();

    } catch (IOException e) {
        logger.error("An error has occurred!!!");
        e.printStackTrace();
    }

}

public void load()
{
    try {
        File read1 = new File("visitor_alice.txt");
        Scanner reader1 = new Scanner(read1);
        while(reader1.hasNextLine()){
            String alice_info = reader1.nextLine();
            System.out.println(alice_info);
        }

        System.out.println("-------------------------------------");

        File read = new File("visitor_bob_marley.txt");
        Scanner reader = new Scanner(read);
        while(reader.hasNextLine())
        {
            String visitor_info = reader.nextLine();
            System.out.println(visitor_info);
        }

    } catch (FileNotFoundException e) {
        logger.error("File Not found");
        e.printStackTrace();
    }
}

}
